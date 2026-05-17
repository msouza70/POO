package br.uepg.deinfo.primeiro;

public class Pessoa {
   protected String nome;
   protected int codigo;
   protected double salario;
   
   protected Pessoa(String nome, int codigo, double salario) {
      this.nome = nome;
      this.codigo = codigo;
      this.salario = salario;
   }
   
   public String getNome() {
      return this.nome;
   }
   
   public int getCodigo() {
      return this.codigo;
   }
   
   public String toString() {
      return "Nome: " + this.nome + "\nCodigo: " + this.codigo;
   }
}
    
