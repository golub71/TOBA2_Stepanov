/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA.Controllers;

import UserBean.UserJavabean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author robertstepanov
 */


public class NewCustomerServlet extends HttpServlet {

 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "Success.html";
        String action = request.getParameter("action");
        if (action == null) {
            action = "joint";
            
        if (action.equals("join")) {
            url = "/Success.html";
        }
        else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String email = request.getParameter("email");
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            
            
            User user = new User(firstName, lastName, phoneNumber, address, city, state, email, userName, password);
                   
        }
        }
        {
            UserJavabean UserJavabean;
            UserJavabean = new UserJavabeanean();
                    
                   // UserJavabean.setName(userName.zip);
                    UserJavabean.setPassword("Welcome1");
                
                }
           
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            String message;
            if (firstName == null || lastName==null || phoneNumber==null || address==null
                    || city==null || state==null || zip==null || email==null || firstName.isEmpty()
                    || lastName.isEmpty() || phoneNumber.isEmpty() || address.isEmpty() || city.isEmpty()
                    || state.isEmpty() || zip.isEmpty() || email.isEmpty()) {
                message = "Please fill out all form fields.";
                url = "/New_customer.html";
            }
            else {
                message = "";
                url = "/Success.html";
            }
            
            RequestDispatcher rd=request.getRequestDispatcher(url);
                rd.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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

    private static class UserJavabeanean extends UserJavabean {

        public UserJavabeanean() {
        }
    }

    }

  

