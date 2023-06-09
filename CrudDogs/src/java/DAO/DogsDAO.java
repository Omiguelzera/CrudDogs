/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Dogs;

/**
 *
 * @author alunos
 */
public class DogsDAO {
    
    
    public void Cadastra(Dogs d) throws ClassNotFoundException ,SQLException{
     Connection con = conexao.getConexao();
     PreparedStatement comando = con.prepareStatement ("insert into tdogs ( nome, idade, raca, peso, porte, cor, nd, endereco, comidafav) values (?,?,?,?,?,?,?,?,?)");
     comando.setString(1, d.getNome());
     comando.setInt(2, d.getIdade());
     comando.setString(3, d.getRaca()); 
     comando.setDouble(4, d.getPeso());
     comando.setString(5, d.getPorte());
     comando.setString (6, d.getCor());
     comando.setString(7, d.getDescricao());
     comando.setString(8, d.getEndereco());
     comando.setString(9, d.getComidafav());
     comando.execute();
     comando.close();
     
     
      
    }
    
     public void  Deletar(Dogs d) throws ClassNotFoundException, SQLException{
         Connection con = conexao.getConexao();
         PreparedStatement comando = con.prepareStatement ("delete from tdogs where codigo = ?");
         comando.setInt(1, d.getCodigo());
         comando.execute();
 
     }
     
     public void Atualizar(Dogs d ) throws ClassNotFoundException, SQLException{
      Connection con = conexao.getConexao();
      PreparedStatement comando = con.prepareStatement("update tdogs set  nome =?, idade =?, raca=?, peso=?, porte=?, cor=?, nd=?, endereco=?, comidafav=? where codigo = ?");
      comando.setString(1, d.getNome());
      comando.setInt(2, d.getIdade());
      comando.setString(3, d.getRaca());
      comando.setDouble(4, d.getPeso());
      comando.setString(5, d.getPorte());
      comando.setString(6, d.getCor());
      comando.setString(7, d.getDescricao());
      comando.setString(8, d.getEndereco());
      comando.setString(9, d.getComidafav());
      comando.setInt(10, d.getCodigo());
      comando.execute();
      comando.close();
      
     }
    
     
     public Dogs Consulta(Dogs d) throws ClassNotFoundException, SQLException{
     Connection con = conexao.getConexao();
     PreparedStatement comando = con.prepareStatement("select * from tdogs where codigo =?");
     comando.setInt(1, d.getCodigo());
     ResultSet rs = comando.executeQuery();
     Dogs dg = new Dogs();
     if(rs.next()){
      dg.setCodigo(rs.getInt("codigo"));
      dg.setNome(rs.getString("nome"));
      dg.setIdade(rs.getInt("idade"));
      dg.setRaca(rs.getString("raca"));
      dg.setPeso(rs.getDouble("peso"));
      dg.setPorte(rs.getString("porte"));
      dg.setCor(rs.getString("cor"));
      dg.setDescricao(rs.getString("nd"));
      dg.setEndereco(rs.getString("endereco"));
      dg.setComidafav(rs.getString("comidafav"));
      con.close();
     }
     return dg;
   }
     
     
     public List<Dogs> ConsultaTodos() throws ClassNotFoundException, SQLException{
     Connection con = conexao.getConexao();
     PreparedStatement comando = con.prepareStatement("select * from tdogs");
     ResultSet rs = comando.executeQuery();
     List<Dogs> ldog = new ArrayList<Dogs>();
     while(rs.next()){
         Dogs dg = new Dogs();
      dg.setCodigo(rs.getInt("codigo"));
      dg.setNome(rs.getString("nome"));
      dg.setIdade(rs.getInt("idade"));
      dg.setRaca(rs.getString("raca"));
      dg.setPeso(rs.getDouble("peso"));
      dg.setPorte(rs.getString("porte"));
      dg.setCor(rs.getString("cor"));
      dg.setDescricao(rs.getString("nd"));
      dg.setEndereco(rs.getString("endereco"));
      dg.setComidafav(rs.getString("comidafav"));
      ldog.add(dg);
     
     }
     
     return ldog;
     }
}