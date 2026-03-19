public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

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
    
    public void reajustar(int percent) {
        if (percent>=1 && percent<=100)
         this.preco = this.preco + (this.preco * percent/100);
      else System.out.println("Percentual inválido");
        
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade " + this.quantidade);
    }
}
