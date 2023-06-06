<%-- 
    Document   : Erro
    Created on : 29/05/2023, 11:00:09
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de erro</title>
        <Link rel="stylesheet" href="OP.css">
    </head>
    <body>
        <% String msg = (String)request.getAttribute("message");%>
        <h1><%out.println(msg);%></h1>
        <h1>Algo deu errado com a operação</h1>
    </body>
</html>
