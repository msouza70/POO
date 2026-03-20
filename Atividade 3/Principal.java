public class Principal {

   public static void main(String args[]) {
      
      ContaCorrente vetor[];
      
      vetor = new ContaCorrente[3];
      
      vetor[0] = new ContaCorrente("Fulano",200,10,1000,100);
      vetor[1] = new ContaCorrente("Sicrano",201,10,2000);
      vetor[2] = new ContaCorrente("Beltrano",203,10);
      
      vetor[0].atualizar(500,50);
      vetor[1].sacar(500);
      vetor[2].depositar(100);
      
      vetor[0].imprimir();
      System.out.println();
      vetor[1].imprimir();
      System.out.println();
      vetor[2].imprimir();
    }
}    