public class Funcionario extends Pessoa{

    private int registro;
    private double salario;

    public Funcionario(String nome, Data dataNasc, String telefone, int registro, double salario) {
        super(nome, dataNasc, telefone);
        this.registro = registro;
        this.salario = salario;
    }

    public Funcionario(String nome, Data dataNasc, int registro, double salario) {
        super(nome, dataNasc);
        this.registro = registro;
        this.salario = salario;
    }
  
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCodigo: " + this.registro + "\nSalario: " + this.salario;
    }
}
