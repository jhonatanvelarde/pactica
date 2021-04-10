
package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio1", urlPatterns = {"/Ejercicio1"})
public class Ejercicio1 extends HttpServlet {

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
            out.println("<form action ='Salida1' method ='post'>");
                out.println("<label> NOMBRE </label>");
                out.println("<input type='text'name='nombre'>");
                out.println("<br>");
                
                out.println("<label> AÑO DE NACIMIENTO </label>");
                out.println("<input type='text'name='ano'>");
                out.println("<br>");
                
                out.println("<input type='submit' value='procesar'>");
                
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
