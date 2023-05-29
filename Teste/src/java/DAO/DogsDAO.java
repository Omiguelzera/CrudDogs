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
     PreparedStatement comando = con.prepareStatement ("insert into Tdogs (codigo, nome, idade, raca, peso, porte, cor, descricao, endereco, comidafav) values (?,?,?,?,?,?,?,?,?,?)");
     comando.setInt(1, d.getCodigo());
     comando.setString(2, d.getNome());
     comando.setInt(3, d.getIdade());
     comando.setString(4, d.getRaca()); 
     comando.setDouble(5, d.getPeso());
     comando.setString(6, d.getPorte());
     comando.setString (7, d.getCor());
     comando.setString(8, d.getDescricao());
     comando.setString(9, d.getEndereco());
     comando.setString(10, d.getComidafav());
     comando.execute();
     comando.close();
     
     
      
    }
    
     public void  Deletetar(Dogs d) throws ClassNotFoundException, SQLException{
         Connection con = conexao.getConexao();
         PreparedStatement comando = con.prepareStatement ("delete from tdogs where id = ?");
         comando.setInt(1, d.getCodigo());
         comando.execute();
 
     }
     
     public void Atualizar(Dogs d ) throws ClassNotFoundException, SQLException{
      Connection con = conexao.getConexao();
      PreparedStatement comando = con.prepareStatement("update tdogs set codigo =?, nome =?, idade =?, raca=?, peso=?, porte=?, cor=?, descricao=?, endereco=?, comidafav=?");
      comando.setInt(1, d.getCodigo());
      comando.setString(2, d.getNome());
      comando.setInt(3, d.getIdade());
      comando.setString(4, d.getRaca());
      comando.setDouble(5, d.getPeso());
      comando.setString(6, d.getPorte());
      comando.setString(7, d.getCor());
      comando.setString(8, d.getDescricao());
      comando.setString(9, d.getEndereco());
      comando.setString(10, d.getComidafav());
      comando.execute();
      comando.close();
      
     }
    
     
     public Dogs Consulta(Dogs d) throws ClassNotFoundException, SQLException{
     Connection con = conexao.getConexao();
     PreparedStatement comando = con.prepareStatement("select* from tdogs whre id =?");
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
      dg.setDescricao(rs.getString("descricao"));
      dg.setEndereco(rs.getString("endereco"));
      dg.setComidafav(rs.getString("comidafav"));
     }
     return dg;
   }
     
     
     public List<Dogs> ConsultaTodos() throws ClassNotFoundException, SQLException{
     Connection con = conexao.getConexao();
     PreparedStatement comando = con.prepareStatement("select * from tdogs");
     ResultSet rs = comando.executeQuery();
     List<Dogs> ldog = new ArrayList<Dogs>();
     if(rs.next()){
         Dogs dg = new Dogs();
      dg.setCodigo(rs.getInt("codigo"));
      dg.setNome(rs.getString("nome"));
      dg.setIdade(rs.getInt("idade"));
      dg.setRaca(rs.getString("raca"));
      dg.setPeso(rs.getDouble("peso"));
      dg.setPorte(rs.getString("porte"));
      dg.setCor(rs.getString("cor"));
      dg.setDescricao(rs.getString("descricao"));
      dg.setEndereco(rs.getString("endereco"));
      dg.setComidafav(rs.getString("comidafav"));
     
     }
     
     return ldog;
     }
}