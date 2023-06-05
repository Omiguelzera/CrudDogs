<%-- 
    Document   : ListaDogs
    Created on : 04/06/2023, 21:12:41
    Author     : migue
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Dogs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabela de cadastro</title>
         <link rel="stylesheet" href="Tabela.css">
    </head>
    <body>
        <h1>Lista de cachorros cadastrados</h1>
        <%
        ArrayList<Dogs> listaDogs = (ArrayList<Dogs>) request.getAttribute("ldog");
        %>
   <table border ="1"     
    <thead>
        <tr>
            <th>Codigo</th>
            <th>Nome</th>
            <th>Idade</th>
            <th>Raça</th>
            <th>Peso</th>
            <th>Porte</th>
            <th>Cor</th>
            <th>Dono</th>
            <th>Endereço</th>
            <th>ComidaFav</th> 
        </tr>       
       </thead>   
       <tbody>
           <%
            for(Dogs d : listaDogs){
           %>
           <tr>
               <td><%= d.getCodigo()%></td>
                <td><%= d.getNome()%></td>
                 <td><%= d.getIdade()%></td>
                  <td><%= d.getRaca()%></td>
                   <td><%= d.getPeso()%></td>
                    <td><%= d.getPorte()%></td>
                     <td><%= d.getCor()%></td>
                      <td><%= d.getDescricao()%></td>
                       <td><%= d.getEndereco()%></td>
                        <td><%= d.getComidafav()%></td>
           </tr>
           
           
           <%}%>
       </tbody>
   </table>
        <div class="groupb">
            <a href="http://localhost:8084/Dogsproj/cadastroDogs.html" 
                  class="botoes">Voltar ao Cadastro</a>
            </div>
    </body>
</html>
