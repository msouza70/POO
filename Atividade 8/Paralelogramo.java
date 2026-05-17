public abstract class Paralelogramo implements FiguraGeometrica, FiguraEscalavel{
    protected double altura, base;

    public Paralelogramo(double altura, double base)  {
       this.altura = altura;
    	 this.base = base;
    }
    
    public void aumentarFigura(double indice) {
        this.altura = this.altura + indice;
        this.base = this.base + indice;
    }
            
    public void diminuirFigura(double indice) {
        this.altura = this.altura - indice;
        this.base = this.base - indice;
    }
    
    public double calcularPerimetro(){
    	return 2*(this.altura + this.base);
    }

    public double calcularArea(){
    	return this.altura * this.base;
    }

    public String toString() {
    	return "Lados: "+ this.altura + " e "+ this.base;
    }   
}
