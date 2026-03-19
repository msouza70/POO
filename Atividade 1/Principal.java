public class Principal {

   public static void main(String args[]) {
      
      ContaCorrente conta1, conta2;
      
      conta1 = new ContaCorrente();
      conta2 = new ContaCorrente();
            
      conta1.nome="Fulano";
      conta1.agencia = 10;
      conta1.numero = 100;
      conta1.depositar(1000);
      conta1.sacar(100);
      conta1.imprimir();
      
      System.out.println();
      
      conta2.nome="Beltrano";
      conta2.agencia = 10;
      conta2.numero = 102;
      conta2.depositar(500);
      conta2.imprimir();
   }
}