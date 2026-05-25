import javax.swing.JOptionPane;

public class Principal {

   public static void main(String args[]){
      ContaCorrente conta;
      String nome, temp;
      int numero;
      double valor;
   
      do {
      
            try {
               nome = JOptionPane.showInputDialog(null,"Digite o nome do correntista");
               if (nome==null)
                  return;
               temp = JOptionPane.showInputDialog(null,"Digite o número da conta");
               if (temp==null)
                  return;
               numero = Integer.parseInt(temp);
               conta = new ContaCorrente(numero,nome);
               temp = JOptionPane.showInputDialog(null,"Digite o valor a ser depositado");
               if (temp==null)
                  return;
               valor = Double.parseDouble(temp);
               conta.depositar(valor);
               JOptionPane.showMessageDialog(null,conta);
               return;
            } catch (NumberFormatException ex) {
               JOptionPane.showMessageDialog(null,"Voce deve digitar um número");
            } catch (MinhaExcecao ex) {
               JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        } while (true);              
    }
}           