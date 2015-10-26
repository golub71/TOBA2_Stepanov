/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA.New_customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author robertstepanov
 */
public class New_customerServlet extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            String url = "/New_customer.html";
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
            }
            
        }
        
    }

  

