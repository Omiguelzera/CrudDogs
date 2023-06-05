<%-- 
    Document   : confirmaATT
    Created on : 04/06/2023, 21:57:57
    Author     : migue
--%>

<%@page import="model.Dogs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela para confirmar alterações</title>
    </head>
    <body>
        <h1>Atualizar dados</h1>
        <%
         Dogs d = (Dogs) request.getAttribute("dg");
        %>
        <%if(d.getNome() !=null){%>
        
        <form name="f1" action="DogsControle" method="Post">
            Codigo : <%out.print(d.getCodigo());%><input type="hidden" name="txtId" value="<%out.print(d.getCodigo());%>"><BR>
            Nome:  <input type="text" name="txtNome" value="<%out.print(d.getNome());%>"><BR>
            Idade: <input type="text" name="txtIdade" value="<%out.print(d.getIdade());%>"><BR>
            Raça:  <input type="text" name="txtRaca" value="<%out.print(d.getRaca());%>"><BR>
            Peso:  <input type="text" name="txtPeso" value="<%out.print(d.getPeso());%>"><BR>
            Porte: <input type="text" name="txtPorte" value="<%out.print(d.getPorte());%>"><BR>
            Cor:   <input type="text" name="txtCor" value="<%out.print(d.getCor());%>"><BR>
            Dono:  <input type="text" name="txtND" value="<%out.print(d.getDescricao());%>"><BR>
            Endereço: <input type="text" name="txtEndereco" value="<%out.print(d.getEndereco());%>"><BR>
            Comida favorita: <input type="text" name="txtCF" value="<%out.print(d.getComidafav());%>"><BR>
            <input type="submit" name="op" value="CONFIRMAR ATUALIZACAO" >
        </form>
         <%}else {%>
         <h2>Cadastro não encontrado</h2>
         <%}%>
    </body>
</html>
