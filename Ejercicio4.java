
package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio4", urlPatterns = {"/Ejercicio4"})
public class Ejercicio4 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO DE MONEDAS </h1>");
            
            out.println("<form action='Ejercicio4' metod='post'>");
                out.println("</label>introdusca la cantidad </label>");
                out.println("<br>");
                out.println("<input type='text'name ='bolivianos'>");
                out.println("<br><br>");
                
                out.println("<select name='moneda'><option>dolares</option><option>bolivianos</option></select>");
                
                out.println("<br><br>");
                out.println("<input type='submit' value='procesar'>"); 
            
            out.println("</form>");
            out.println("</body>");
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
        
        String cantidad = request.getParameter("bolivinos");
        String moneda=request.getParameter("moneda");
        int valor =Integer.parseInt(cantidad);
        double total=0;
        System.out.println("moneda"+moneda);
        if (moneda.equals("bolivianos")) {
            total=valor/6.95;
        }
        if (moneda.equals("dolares")) {
            total=valor*6.95;
        }
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO DE MONEDAS </h1>");
            if (moneda.equals("bolivianos")) {
                out.println("<h1>CAMBIO DE BOLIVIANOS A DOLARES"+total+" </h1>");
            }
            if (moneda.equals("dolares")) {
                out.println("<h1>CAMBIO DE DOLARES A BOLIVIANOS ES : "+total+" </h1>");
            }
           
            out.println("</body>");
            out.println("</html>");
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
