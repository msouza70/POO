public class ContaCorrente {
   public String nome;
   public int numero;
   public int agencia;
   private double saldo;
   
   public void sacar(double valor) {
      if (valor>0 && valor<=this.saldo)
         this.saldo = this.saldo - valor;
      else System.out.println("Valor de saque inválido!");
   }
 
   public void depositar(double valor) {
      if (valor>0)
         this.saldo = this.saldo + valor;
      else System.out.println("Valor de depósito inválido!");
   }
   
   public void imprimir() {
      System.out.println("Nome: " + this.nome);
      System.out.println("Número: " + this.numero);
      System.out.println("Agência: " + this.agencia);
      System.out.println("Saldo: " + this.saldo);
   }            
}