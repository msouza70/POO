public class ContaCorrente {

   private int numero;
   private double saldo;
   private String nome;
   
   public ContaCorrente(int numero, String nome) {
      this.numero=numero;
      this.nome=nome;
   }
   
   public void sacar(double valor) throws MinhaExcecao {
      if (valor <= 0)
         throw new MinhaExcecao("Digite um valor maior que zero");
      if (valor > this.saldo)
         throw new MinhaExcecao("Digite um valor maior que zero");
      this.saldo = this.saldo - valor;
   }

   public void depositar(double valor) throws MinhaExcecao {
      if (valor <= 0)
         throw new MinhaExcecao("Digite um valor maior que zero");
      this.saldo = this.saldo + valor;
   }
   
   public String toString() {
      return "Nome: " + this.nome + "\nSaldo: " + this.saldo;
   }
} 