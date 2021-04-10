
package com.jhonatanvelardecondori;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jhona
 */
public class Ejercicio7 extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Saludo de bienvenida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Ejercicio 7</h1>");
             out.println("<h4>Programar un servlet que solicite un valor y pulsando el botón “Procesar” genere la matriz caracol</h4>");
            out.println("<form action='Ejercicio7' method='post'>");
            out.println("<label>Tamaño de la matriz N * N :</label>");
            out.println("<input type='numer' name='ano'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Calcular'>");
            out.println("<br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
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
        String ano = request.getParameter("ano");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>matriz caracol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Matriz Generada</h1>");
            int n = Integer.parseInt(request.getParameter("ano"));
            int c = 1;
            int mat[][] = new int[100][100];
            for (int r = 0; r < n / 2; r++) {
                for (int i = r; i < n - r; i++) {
                    mat[r][i] = c;
                    c++;
                }
                for (int i = r + 1; i < n - r; i++) {
                    mat[i][n - r - 1] = c;
                    c++;
                }
                for (int i = n - r - 2; i > r; i--) {
                    mat[n - r - 1][i] = c;
                    c++;
                }
                for (int i = n - r - 1; i > r; i--) {
                    mat[i][r] = c;
                    c++;
                }
            }
            out.println("<table border =2>");
            for (int i = 0; i < n; i++) {
                out.println("<tr>");
                for (int j = 0; j < n; j++) {
                    out.print("<td>" + mat[i][j] + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<br><br>");
            out.println("<a href='Ejercicio7'>Volver al inicio</a>");
            out.println("<br><br>");
            out.println("<a href='index1'>Volver al inicio</a>");
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
