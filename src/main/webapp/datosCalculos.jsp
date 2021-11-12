<%-- 
    Document   : datosCalculos
    Created on : Nov 11, 2021, 9:41:37 PM
    Author     : Familia Rayo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.datos1proyecto2.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= new java.util.Date()%>
        <%String expresion=request.getParameter("calculo");%>
        <% String post=Conversion_a_Postfijo.conversion(expresion);%>
       <%=Conversion_a_Postfijo.conversion(expresion)%>
        <%=Solucion.resolution(post)%>
        
        
        
    </body>
</html>
