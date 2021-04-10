package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class index1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>practica 1</title>");            
            out.println("</head>");
            out.println("<body>");
            
                out.println("<h1>MENU DE LA PRACRICA</h1>");
                
                out.println("<a href='Ejercicio1'>EJERCICIO 1 </a>");
                out.println("<br>");out.println("<br>");
                out.println("<a href='Ejercicio2'>EJRECICIO 2 </a>");
                out.println("<br>");
                out.println("<br>");
                out.println("<a href='Ejercicio3'>EJERCICIO 3 </a>");
                out.println("<br>");
                out.println("<br>");
                out.println("<a href='Ejercicio4'>EJERCICIO 4</a>");
                out.println("<br>");
                out.println("<br>");
                out.println("<a href='Ejercicio5'>ENERCICIO 5 </a>");
                out.println("<br>");
                out.println("<br>");
                out.println("<a href='Ejercicio6'>EJERCICIO 6 </a>");
                out.println("<br>");
                out.println("<br>");
                out.println("<a href='Ejercicio7'>EJERCICIO 7 </a>");
                    
            out.println("</body>");
            out.println("</html>");
        }

    }
}
