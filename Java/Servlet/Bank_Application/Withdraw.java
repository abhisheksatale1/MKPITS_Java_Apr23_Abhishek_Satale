/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Withdraw extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        int Amount=Integer.parseInt(request.getParameter("amount")); 
        
        
        HttpSession httpsession =request.getSession(true);  
       String userid = httpsession.getAttribute("u_id").toString();
        Date date=new java.sql.Date(httpsession.getCreationTime());
        String Transationtype= "Withdraw";
            /* TODO output your page here. You may use following sample code. */
            
                Class.forName("com.mysql.cj.jdbc.Driver");
                out.println("driver loaded");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Abhi@123");
                out.println("connection established");
                
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            preparedStatement.setString(1, userid);
            preparedStatement.setDate(2, date);
            preparedStatement.setInt(3, Amount);
            preparedStatement.setString(4, Transationtype);
            
            
            int resultSet = preparedStatement.executeUpdate();
            if(resultSet != 0){
                out.println("amount Credited successfully");
            }else{
                out.println("unable to Credited amount");
            }
            PreparedStatement prepareUpdateStatement = connection.prepareStatement("update Account_Details set balance = balance - ? where user_id = ? ");
            prepareUpdateStatement.setString(2, userid);
            prepareUpdateStatement.setInt(1, Amount);
            
            
            
            

           int resultUpdateSet = prepareUpdateStatement.executeUpdate();
            if(resultUpdateSet != 0){
                out.println("Balance Updated");
            }else{
                out.println("unable to Update Balance");
            }
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
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
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
