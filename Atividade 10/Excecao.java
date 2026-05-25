import javax.swing.JOptionPane;

public class Excecao {

   public static void main(String args[]) {
      Aluno vetor[] = new Aluno[2];
      vetor[0] = new Aluno();
      String temp;
      int soma, numero;
      
      do {
         try {
            temp = JOptionPane.showInputDialog(null,"Digite um indice de vetor: ");
            if (temp==null)
               return;
            int indice = Integer.parseInt(temp);
            temp = JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");
            if (temp==null)
               return;
            vetor[indice].setNome(temp);
            temp = JOptionPane.showInputDialog(null,"Digite a soma das notas de todas as provas: ");
            if (temp==null)
               return;
            soma = Integer.parseInt(temp);
            temp = JOptionPane.showInputDialog(null,"Digite o numero de provas: ");
            if (temp==null)
               return;
            numero = Integer.parseInt(temp);
            vetor[indice].setMedia(soma/numero);
            JOptionPane.showMessageDialog(null,vetor[indice]);
            return;
            
         } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null,"Divisão por zero","Erro!",JOptionPane.ERROR_MESSAGE);
         } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Voce precisa digitar um valor numérico","Erro!",JOptionPane.ERROR_MESSAGE);
         }catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Voce precisa digitar um índice de vetor válido","Erro!",JOptionPane.ERROR_MESSAGE);
         }catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,"Objeto não existente","Erro!",JOptionPane.ERROR_MESSAGE);
         }

      } while (true);
   }
}   
  