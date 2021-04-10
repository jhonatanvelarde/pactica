
package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Salida1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre = request.getParameter("nombre");
        String ano=request.getParameter("ano");
        
       int edad=2021-(Integer.parseInt(ano));
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>  salida </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> DATOS DE PERSONA</h1>");              
                out.println("<P> NOMBRE :"+nombre+"</P>");
                out.println("<br>");
                out.println("<P> EDAD :"+edad+"</P>");
                out.println("<br>");
                out.println("<a href='Ejercicio1'>volver al inicio </a>");
                out.println("<a href='index1'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
