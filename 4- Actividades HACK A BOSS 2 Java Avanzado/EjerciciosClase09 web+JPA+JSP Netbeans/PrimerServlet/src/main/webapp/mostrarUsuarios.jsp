<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%-- 
    Document   : mostrarUsuarios
    Created on : 19 dic 2024, 17:32:06
    Author     : Alberto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
            <%
                List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                int cont = 1;
                for (Usuario usu : listaUsuarios){
                
                
            %>      
            
                    <p><b>Usuario nº <%=cont%></b></p>
                    <p>Dni: <%=usu.getDni()%></p>
                    <p>Nombre: <%=usu.getNombre()%></p>
                    <p>Apellido: <%=usu.getApellido()%></p>
                    <p>Telefono: <%=usu.getTelefono()%></p>
                    <p>---------------------------------</p>
                    <% cont = cont + 1;%>
            
            
            
            
            <% } %>
        
    </body>
</html>
