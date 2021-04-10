
package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Salida2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String numero=request.getParameter("numero");
        
       int edad=Integer.parseInt(numero);
        int resultado=1;
        for (int i = 1; i <= edad; i++) {
            resultado*=i;
            
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>  salida </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> RESULTADO FACTORIAL</h1>");              
                out.println("<P>NUMERO :"+edad+"</P>");
                out.println("<br>");
                out.println("<P> FACTORIAL :"+resultado+"</P>");
                out.println("<br>");
                 out.println("<a href='Ejercicio2'>volver al inicio </a>");
                out.println("br>"); 
                out.println("<a href='index1'>volver al menu </a>");
               
            out.println("</body>");
            out.println("</html>");
        }
    }
}