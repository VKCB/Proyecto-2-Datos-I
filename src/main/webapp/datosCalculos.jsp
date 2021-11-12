
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="com.mycompany.datos1proyecto2.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% 
           String expresion=request.getParameter("display");
           
       %>
       <%=Conversion_a_Postfijo.conversion(expresion)%>
       
       
    </body>
</html>
