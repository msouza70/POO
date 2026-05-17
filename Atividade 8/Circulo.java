public class Circulo implements FiguraGeometrica, FiguraEscalavel {
   private double raio;
   
   public Circulo(double raio) {
      this.raio = raio;
   }
   
   public double calcularArea() {
      return Math.PI*this.raio*this.raio;
   }
   
   public double calcularPerimetro() {
      return 2*Math.PI*this.raio;
   }
   
   public double calcularDiametro() {
      return this.raio + this.raio;
   }
   
   public void aumentarFigura(double valor) {
      raio = this.raio + valor;
   }
   
   public void diminuirFigura(double valor) {
      raio = this.raio - valor;
   }
   
   public String toString() {
      return "Raio: " + raio;
   }
}   