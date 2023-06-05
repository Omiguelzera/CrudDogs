package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Dogs;

public final class ListaDogs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tabela de cadastro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Lista de cachorros cadastrados</h1>\n");
      out.write("        ");

        ArrayList<Dogs> listaDogs = (ArrayList<Dogs>) request.getAttribute("ldog");
        
      out.write("\n");
      out.write("   <table border =\"1\"     \n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Codigo</th>\n");
      out.write("            <th>Nome</th>\n");
      out.write("            <th>Idade</th>\n");
      out.write("            <th>Raça</th>\n");
      out.write("            <th>Peso</th>\n");
      out.write("            <th>Porte</th>\n");
      out.write("            <th>Cor</th>\n");
      out.write("            <th>Dono</th>\n");
      out.write("            <th>Endereço</th>\n");
      out.write("            <th>ComidaFav</th> \n");
      out.write("        </tr>       \n");
      out.write("       </thead>   \n");
      out.write("       <tbody>\n");
      out.write("           ");

            for(Dogs d : listaDogs){
           
      out.write("\n");
      out.write("           <tr>\n");
      out.write("               <td>");
      out.print( d.getCodigo());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( d.getNome());
      out.write("</td>\n");
      out.write("                 <td>");
      out.print( d.getIdade());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( d.getRaca());
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( d.getPeso());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( d.getPorte());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( d.getCor());
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( d.getDescricao());
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( d.getEndereco());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( d.getComidafav());
      out.write("</td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           ");
}
      out.write("\n");
      out.write("       </tbody>\n");
      out.write("   </table>\n");
      out.write("        <div class=\"groupb\">\n");
      out.write("            <a href=\"http://localhost:8080/Test/cadastroDogs.jsp\" \n");
      out.write("                  class=\"botoes\">Voltar ao Cadastro</a>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
