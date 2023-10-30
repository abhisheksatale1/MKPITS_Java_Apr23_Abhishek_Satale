package Bank_Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Statement extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Abhi@123");

            HttpSession httpsession = request.getSession(true);
            String Userid = httpsession.getAttribute("u_id").toString();

            PreparedStatement preparedstatement = connection.prepareStatement("select Transaction_date, Amount, Amount_type from Transactions where user_id=?");
            preparedstatement.setString(1, Userid);
            ResultSet resultSet = preparedstatement.executeQuery();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SBI Statement</title>");
            out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>"); // Add Bootstrap CSS
            out.println("</head>");
            out.println("<body>");
            
            // Print button
            out.println("<div class='container-fluid p-3'>");
            out.println("<button class='btn btn-secondary' onclick='window.print()'>Print Statement</button>");
            out.println("</div>");

            // Bootstrap table
            out.println("<div class='container'>");
            out.println("<h2 class='mt-4'>SBI Statement</h2>");
            out.println("<h4>User ID: " + Userid + "</h4>");
            out.println("<table class='table table-striped mt-4'>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>Transaction Date</th>");
            out.println("<th>Amount</th>");
            out.println("<th>Transaction Type</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");

            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getDate(1) + "</td>");
                out.println("<td>" + resultSet.getDouble(2) + "</td>");
                out.println("<td>" + resultSet.getString(3) + "</td>");
                out.println("</tr>");
            }

            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");

            preparedstatement = connection.prepareStatement("Select balance from Account_Details where User_id=?");
            preparedstatement.setString(1, httpsession.getAttribute("u_id").toString());
            ResultSet resultsetamount = preparedstatement.executeQuery();

            if (resultsetamount.next()) {
                out.println("<h4 class='text-center mt-4'>Total Amount: Rs. " + resultsetamount.getDouble(1) + "</h4>");
            } else {
                out.println("Unable to calculate");
            }

            out.println("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
            out.println("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js'></script>");
            out.println("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>"); // Add Bootstrap JavaScript

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Statement Servlet";
    }
}