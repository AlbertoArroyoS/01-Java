/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.inventario.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.inventario.logica.Producto;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alberto
 */
@WebServlet(name = "SvInventario", urlPatterns = {"/SvInventario"})
public class SvInventario extends HttpServlet {
    
    private List<Producto> inventario = new ArrayList<>();
        

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvInventario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvInventario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            // Verificamos si ya hay productos cargados en la sesión
            HttpSession session = request.getSession();
            List<Producto> inventarioEnSesion = (List<Producto>) session.getAttribute("inventario");

            if (inventarioEnSesion == null || inventarioEnSesion.isEmpty()) {
                // Si no hay productos, inicializamos los datos por primera vez
                inventario.add(new Producto("Martillo", "Herramienta de mano para clavos", 15.99, 10));
                inventario.add(new Producto("Taladro", "Taladro eléctrico para perforaciones", 79.99, 5));
                inventario.add(new Producto("Sierra", "Sierra manual para madera", 25.50, 7));

                // Guardamos la lista en la sesión
                session.setAttribute("inventario", inventario);

                System.out.println("Productos inicializados en la sesión.");
            } else {
                System.out.println("Productos ya cargados en la sesión.");
            }

            // Redirigir a la página mostrarInventario.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("mostrarInventario.jsp");
            dispatcher.forward(request, response);
            

}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // Recuperar parámetros del formulario
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidadEnStock = Integer.parseInt(request.getParameter("cantidad"));

        // Mostrar datos en consola
        System.out.println("Datos recibidos desde el formulario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en Stock: " + cantidadEnStock);

        // Crear un nuevo producto y agregarlo a la lista
        Producto nuevoProducto = new Producto(nombre, descripcion, precio, cantidadEnStock);
        inventario.add(nuevoProducto);

        // Confirmar al usuario que el producto fue agregado
        response.setContentType("text/html");
        response.getWriter().println("<h1>Producto agregado exitosamente</h1>");
        //Opcion de volver al formulario y redirigir al index
        response.getWriter().println("<a href='index.html'>Volver al formulario</a>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
