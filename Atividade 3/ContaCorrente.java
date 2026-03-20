public class ContaCorrente {
   private String nome;
   private int numero;        
   private int agencia;
   private double saldo;
   private double limite;
   
   public ContaCorrente(String nome, int numero, int agencia, double saldo, double limite) {
      this.nome=nome;
      this.numero=numero;
      this.agencia=agencia;
      this.saldo=saldo;
      this.limite=limite;
   }
   
   public ContaCorrente(String nome, int numero, int agencia, double saldo) {
      this.nome=nome;
      this.numero=numero;
      this.agencia=agencia;
      this.saldo=saldo;
   }
   
   public ContaCorrente(String nome, int numero, int agencia) {
      this.nome=nome;
      this.numero=numero;
      this.agencia=agencia;
   }

   
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   public String getNome() {
      return nome;
   }
   
   public void setNumero(int numero) {
      if (numero>0)
         this.numero = numero;
      else System.out.println("Número de conta inválido");
   }
   
   public int getNumero() {
      return numero;
   }
   
   public void setAgencia(int agencia) {
      if (agencia>0)
         this.agencia = agencia;
      else System.out.println("Número de agencia inválido");
   }
   
   public int getAgencia() {
      return this.agencia;
   }
  
   
   public void setSaldo(double saldo) {
      if (saldo>=0)
         this.saldo = saldo;
      else System.out.println("Valor de saldo inválido");
   }
   
   public double getSaldo() {
      return this.saldo;
   }
   
   public void setLimite(double limite) {
      if (limite>=0)
         this.limite = limite;
      else System.out.println("Valor de limite inválido");
   }
   
   public double getLimite() {
      return this.limite;
   }
   
   
   public void atualizar(double saldo, double limite) {
      if (saldo>=0)
         this.saldo=saldo;
      if (limite>=0)
         this.limite=limite;
   }
   
   public void atualizar(String nome,int numero) {
      this.nome=nome;
      if (numero>0)
         this.numero=numero;
   }

   public void depositar(double valor) {
      if (valor>0)
         this.saldo = this.saldo + valor;
      else System.out.println("Valor de depósito inválido");
   }
   
   public void sacar(double valor) {
      if (valor>0 && valor<=this.saldo)
         this.saldo = this.saldo - valor;
      else System.out.println("Valor de saque inválido!");
   }
   
   public void imprimir() {
      System.out.println("Nome: " + this.nome);
      System.out.println("Número: " + this.numero);
      System.out.println("Agência: " + this.agencia);
      System.out.println("Saldo: " + this.saldo);
      System.out.println("Limite: " + this.limite);
   }  
}   