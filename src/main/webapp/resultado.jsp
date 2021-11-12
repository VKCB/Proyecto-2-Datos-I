<%-- 
    Document   : resultado
    Created on : Nov 12, 2021, 1:45:59 PM
    Author     : Familia Rayo
--%>

<%@page import="com.mycompany.datos1proyecto2.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> Usted ingreso el la siguiente expresion matematica: <%=request.getParameter("calculo")%></h3>
        <h3> El resutlado de la expresion matematica que ha ingresado es : <%String post=Conversion_a_Postfijo.conversion(request.getParameter("calculo"));%> 
            <%=Solucion.resolution(post)%>
        </h3>
        <form action="calculos.html">
           <input type="submit" value="volver ">
            
        </form>>
        
    </body>
</html>
