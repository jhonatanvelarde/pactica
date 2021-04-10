
package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ejercicio3 extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> ejercicio1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1> INTRODUSCA SUS DATOS </h1>");
            out.println("<form action ='Ejercicio3' method ='post'>");
                
                
                out.println("<label> AÑO DE NACIMIENTO </label>");
                out.println("<input type='text'name='ano'>");
                out.println("<br>");
                
                out.println("<input type='submit' value='procesar'>");
                
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ano=request.getParameter("ano");
        int edad =2021-(Integer.parseInt(ano));
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> SU EDAD ES : " + edad+ "</h1>");
             out.println("<a href='Ejercicio3'>volver al inicio </a>");
                out.println("br>"); 
                out.println("<a href='index1'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
