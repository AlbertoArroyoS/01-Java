<%-- 
    Document   : mostrarInventario
    Created on : 19 dic 2024, 19:44:20
    Author     : Alberto
--%>

<%@page import="com.mycompany.inventario.logica.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inventario de Productos</h1>
            <%
                List<Producto> inventario = (List) request.getSession().getAttribute("inventario");
                int cont = 1;

                    for (Producto prod : inventario) {
            %>      
                        <p><b>Producto nº <%= cont %></b></p>
                        <p>Nombre: <%= prod.getNombre() %></p>
                        <p>Descripción: <%= prod.getDescripcion() %></p>
                        <p>Precio: <%= prod.getPrecio() %></p>
                        <p>Cantidad en stock: <%= prod.getCantidadEnStock() %></p>
                        <p>---------------------------------</p>
            <% cont = cont + 1;%>
                     
            <% } %>
    </body>
</html>
