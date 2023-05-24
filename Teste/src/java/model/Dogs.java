/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunos
 */
public class Dogs {
    private int codigo;
    private String nome;
    private int idade;
    private String raca;
    private float peso;
    private String porte;
    private String cor;
    private  String descricao;
    private String endereco;
    private String comidafav;
    
    
    public int getCodigo(){
     return codigo;
    }
   public void setConexao(int codigo){
       this.codigo = codigo; 
   }
   
   public String getNome(){
    return nome;
   }
   public void setNome(String nome){
     this.nome = nome;
   }
    
   public int getIdade (){
   return idade;
   }
   
   public void setIdade(int idade){
    this.idade = idade;
   }
   
   public String getRaca(){
    return raca;
   }
   public void setRaca(String raca){
    this.raca = raca;
   }
   
   public float getPeso(){
    return peso;
   }
   
   public void setPeso(float peso){
    this.peso = peso;
   }
}
