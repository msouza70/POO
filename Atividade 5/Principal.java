public class Principal {

    public static void main(String[] args) {
        
      Data data[] = new Data[4];
      Produto vetor[] = new Produto[4];
      
      data[0] = new Data(12,12,2027);
      data[1] = new Data(12,10);
      
      vetor[0] = new Produto("Arroz",50,1000,data[0]);
      vetor[1] = new Produto("Feijao",20,500,data[1]);
          
      Data d3 = new Data(12,11,2027);
      vetor[0].setValidade(d3);
      
      System.out.println(vetor[0]);
      System.out.println();
      System.out.println(vetor[1]);
   }
}