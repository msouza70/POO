public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private Data validade;

    public Produto(String nome, double preco, int quantidade, Data validade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }
    
    public Produto(String nome, double preco, Data validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    
    public Produto(String nome, Data validade) {
        this.nome = nome;
        this.validade = validade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setPreco(double preco) {
        if (preco>=0) 
            this.preco = preco;
        else System.out.println("Preço inválido");
    }
    
    public double getPreco() {
        return this.preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) 
            this.quantidade = quantidade;
        else System.out.println("Quantidade inválida");
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setValidade(int dia, int mes, int ano) {
        this.validade.setDia(dia);
        this.validade.setMes(mes);
        this.validade.setAno(ano);
    }
    
    public void setValidade(Data validade) {
        this.validade = validade;
    }
    
    public void vender(int qtde) {
      if (qtde>0 && qtde <= this.quantidade)
         this.quantidade = this.quantidade - qtde;
      else System.out.println("Nao ha produtos suficientes em estoque");
    }
    
    public void comprar(int qtde) {
      if (qtde>0)
         this.quantidade = this.quantidade - qtde;
      else System.out.println("Quantidade inválida");
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\npreco: " + this.preco + "\nquantidade: " + this.quantidade + "\nvalidade: " + this.validade;
    }
    
}