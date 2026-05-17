import javax.swing.JOptionPane;
 
public class EntradaSaida {

   public static void main(String args[]) {
   
      int opcao = JOptionPane.showConfirmDialog(null,"Você quer calcular o dobro de um número?");
      if (opcao != 0)
         return;
      String temp = JOptionPane.showInputDialog(null,"Digite um inteiro");
      if (temp == null)
         return;
      int numero = Integer.parseInt(temp);
      JOptionPane.showMessageDialog(null,"O dobro do valor lido e " + (2*numero));
   }
}
   
      
   