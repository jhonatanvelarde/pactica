
package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ejercicio2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action ='Salida2' method ='post'>");
                out.println("<label> DIJITE NUMERO PARA SACAR SU FACTORIAL </label>");
                out.println("<br>");
                out.println("<input type='text'name='numero'>");
                out.println("<br>");
            out.println("<input type='submit' value='procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
