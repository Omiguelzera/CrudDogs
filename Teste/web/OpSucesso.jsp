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
        <title>JSP Page</title>
    </head>
    <body>
        <% request.getAttribute("message");%>
        <%out.println("msg");%>
        <h1>Opecação feita com sucesso</h1>
    </body>
</html>
