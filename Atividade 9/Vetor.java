package br.uepg.deinfo.primeiro;
import javax.swing.JOptionPane;

public class Vetor {

   private Pessoa vetor[] = new Pessoa[1];
   
   public void inserir() {
      String temp = JOptionPane.showInputDialog(null,"Digite o codigo");
      if (temp == null)
         return;
      int codigo = Integer.parseInt(temp);
      temp = JOptionPane.showInputDialog(null,"Digite o salario");
      if (temp == null)
         return;
      double salario = Double.parseDouble(temp);
      String nome = JOptionPane.showInputDialog(null,"Digite o codigo");
      if (nome == null)
         return;
      vetor[0] = new Pessoa(nome,codigo,salario);
   }
   
   public void imprimir() {
      for (int i=0; i<vetor.length; i++)
         System.out.println(vetor[i]);
   }
 }     