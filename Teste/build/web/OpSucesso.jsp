<%-- 
    Document   : OpSucesso
    Created on : 29/05/2023, 11:00:19
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <Link rel="stylesheet" href="OP.css">
        <title>JSP Page</title>
    </head>
    <body>
        <% String msg = (String)request.getAttribute("message");%>
       <h1> <%out.println(msg);%></h1>
        <h1>Operacação feita com sucesso</h1>
    </body>
</html>
