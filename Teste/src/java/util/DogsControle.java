/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import DAO.DogsDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Dogs;

/**
 *
 * @author alunos
 */
@WebServlet(name = "DogsControle", urlPatterns = {"/DogsControle"})
public class DogsControle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String op = request.getParameter("op");
            DogsDAO ddao = new DogsDAO();
            Dogs dg = new Dogs();

            if (op.equals("CADASTRAR")) {
                
                String nome = request.getParameter("txtNome");
                int idade = Integer.parseInt(request.getParameter("txtIdade"));
                String raca = request.getParameter("txtRaca");
                double peso = Double.parseDouble(request.getParameter("txtPeso"));
                String porte = request.getParameter("txtPorte");
                String cor = request.getParameter("txtCor");
                String descricao = request.getParameter("txtND");
                String endereco = request.getParameter("txtEndereco");
                String comidafav = request.getParameter("txtCF");
               
                dg.setNome(nome);
                dg.setIdade(idade);
                dg.setRaca(raca);
                dg.setPeso(peso);
                dg.setPorte(porte);
                dg.setCor(cor);
                dg.setDescricao(descricao);
                dg.setEndereco(endereco);
                dg.setComidafav(comidafav);
                String msg = "Cadastro";

                try {
                    ddao.Cadastra(dg);
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("OpSucesso.jsp").forward(request, response);

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Error ClassNotFound" + ex);
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("Erro.jsp").forward(request, response);
                }

            } else if (op.equals("DELETAR")) {
                int id = Integer.parseInt(request.getParameter("txtId"));
                dg.setCodigo(id);
                String msg = "Deletar";
                try {
                    ddao.Deletetar(dg);
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("OpSucesso.jsp").forward(request, response);

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Error ClassNotFound" + ex);
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("Erro.jsp").forward(request, response);
                }
            } else if(op.equals("LISTAR")){
              try {
               List<Dogs> ldog = ddao.ConsultaTodos();
               request.setAttribute("ldog", ldog);
               request.getRequestDispatcher("ListaDogs.jsp").forward(request, response);
              }catch (ClassNotFoundException | SQLException ex){
              System.out.println("Error ClassNotFound" +ex);
              request.getRequestDispatcher("Erro.jsp").forward(request, response);
              }
              
            
            }else if (op.equals("ATUALIZAR")){
               int id = Integer.parseInt(request.getParameter("txtId"));
               dg.setCodigo(id);
               try{
                    dg = ddao.Consulta(dg);
                    request.setAttribute("dg", dg);
                    request.getRequestDispatcher("confirmaATT.jsp").forward(request, response);
               }catch(ClassNotFoundException | SQLException ex){
                     System.out.println("Error ClassNotFound"+ex);
                     request.getRequestDispatcher("Erro.jsp").forward(request, response);
               }
            }else if(op.equals("CONFIRMAR ATUALIZACAO")){
               int id   = Integer.parseInt(request.getParameter("txtId"));
               String nome = request.getParameter("txtNome");
               int idade = Integer.parseInt(request.getParameter("txtIdade"));
               String raca = request.getParameter("txtRaca");
               double peso = Double.parseDouble(request.getParameter("txtPeso"));
               String porte = request.getParameter("txtPorte");
               String cor = request.getParameter("txtCor");
               String descricao = request.getParameter("txtND");
               String endereco = request.getParameter("txtEndereco");
               String comidafav = request.getParameter("txtCF");
               dg.setCodigo(id);
               dg.setNome(nome);
               dg.setIdade(idade);
               dg.setRaca(raca);
               dg.setPeso(peso);
               dg.setPorte(porte);
               dg.setCor(cor);
               dg.setDescricao(descricao);
               dg.setEndereco(endereco);
               dg.setComidafav(comidafav);
               String msg = "Atualização";
               
               try{
                    ddao.Atualizar(dg);
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("OpSucesso.jsp").forward(request, response);
               }catch(ClassNotFoundException | SQLException ex){
                   System.out.println("Error ClassNotFound " + ex);
                   request.setAttribute("message", msg);
                   request.getRequestDispatcher("Erro.jsp").forward(request, response);
               }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
