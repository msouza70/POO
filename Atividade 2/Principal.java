public class Principal {

    public static void main(String[] args) {
        Produto prod1;
        prod1 = new Produto();
                
        prod1.setNome("Refrigerante");
        prod1.setPreco(6.0);
        prod1.setQuantidade(100);
        prod1.reajustar(50);
        prod1.vender(20);
        prod1.imprimir();
        
    }
    
}
