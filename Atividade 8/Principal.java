public class Principal {
    
    public static void main(String[] args) {
        
        FiguraGeometrica vetor[] = new FiguraGeometrica[3];
        FiguraEscalavel temp;
        
        vetor[0] = new Quadrado(2);
        vetor[1] = new Circulo(3);
        vetor[2] = new Retangulo(2,3); 
        
        for (int i=0; i<vetor.length;i++) {
            temp = (FiguraEscalavel) vetor[i];
            temp.aumentarFigura(2);
            System.out.printf("Area: %.2f\n",vetor[i].calcularArea());
            System.out.printf("Perimetro %.2f\n",vetor[i].calcularPerimetro());
        }    
    } 
}