package Bank_Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek
 */
public class Statement extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            

            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("driver loaded");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Abhi@123");
                out.println("connection established");
                
                HttpSession httpsession = request.getSession(true);
            String Userid = httpsession.getAttribute("u_id").toString();
            out.println("<h1>UserId : "+Userid+"</h1>");
            
            PreparedStatement preparedstatement = connection.prepareStatement("select Transaction_date, Amount, Amount_type from Transactions where user_id=?");
                    preparedstatement.setString(1, Userid);
                    ResultSet resultSet = preparedstatement.executeQuery(); 
            /* TODO output your page here. You may use following sample code. */
            
                  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Statement</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table align=center border=1 cellspacing=3 cellpadding=10>"
            + "<tr>"
                    +"<th>Transaction Date</th>"
                    +"<th>Amount</th>"
                    +"<th>Transaction Type</th>"
            +"</tr>");
             
            while(resultSet.next()){
            out.println("<tr>"
                    +"<td>"+resultSet.getDate(1)+"</td>"    
                    +"<td>"+resultSet.getDouble(2)+"</td>"    
                    +"<td>"+resultSet.getString(3)+"</td>"    
                    + "</tr>");
              }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
           
        
            }
            
                     
            
            
        }
    
        
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Statement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Statement.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}