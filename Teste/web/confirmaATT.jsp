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
            <h3> Nome: <input type="text" name="txtNome" value="<%out.print(d.getNome());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Idade: <input type="text" name="txtIdade" value="<%out.print(d.getIdade());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Raça: <input type="text" name="txtRaca" value="<%out.print(d.getRaca());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Peso: <input type="text" name="txtPeso" value="<%out.print(d.getPeso());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Porte: <input type="text" name="txtPorte" value="<%out.print(d.getPorte());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Cor: <input type="text" name="txtCor" value="<%out.print(d.getCor());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Nome do Dono: <input type="text" name="txtND" value="<%out.print(d.getDescricao());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Endereço: <input type="text" name="txtEndereco" value="<%out.print(d.getEndereco());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <h3> Comida Favorita: <input type="text" name="txtCF" value="<%out.print(d.getComidafav());%>"required><span class="required-msg"> (Campo obrigatório)</span><BR></h3>
            <input type="submit" name="op" value="CONFIRMAR ATUALIZACAO" >
        </form>
         <%}else {%>
         <h2>Cadastro não encontrado</h2>
         <%}%>
    </body>
</html>
