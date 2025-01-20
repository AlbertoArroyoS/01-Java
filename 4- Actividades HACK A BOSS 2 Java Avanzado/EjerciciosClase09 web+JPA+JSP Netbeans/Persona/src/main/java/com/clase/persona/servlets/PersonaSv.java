/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.clase.persona.servlets;

import com.clase.persona.logica.Controladora;
import com.clase.persona.logica.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alberto
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PersonaSv") // Esta anotación define la ruta del servlet
public class PersonaSv extends HttpServlet {
    private List<Persona> listaPersonas = new ArrayList<>();
    private Controladora control = new Controladora();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setTelefono(telefono);

        //modificamos la lista por el método crear
       control.crearPersona(persona);

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String consultaApellido = request.getParameter("consultaApellido");

       /* //Acá traeremos la lista de personas desde la base de datos. Ya no trabajaremos con la bd lógica (lista)
        listaPersonas = control.traerPersonas();
                
        // Array para guardar las coincidencias de apellido
        ArrayList<Persona> personasCoincidentes = new ArrayList<>();

        for (Persona persona : listaPersonas) {
            if (persona.getApellido().equalsIgnoreCase(consultaApellido)) {
                personasCoincidentes.add(persona);
            }
        }*/
       
       List<Persona> personasCoincidentes = control.busquedaPorApellido(consultaApellido);

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", personasCoincidentes);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }
}
