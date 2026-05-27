public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, Data dataNasc, String telefone, String ra) {
        super(nome, dataNasc, telefone);
        this.ra = ra;
    }

    public Aluno(String nome, Data dataNasc, String ra) {
        super(nome, dataNasc);
        this.ra = ra;
    }
    
    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String toString() {
        return super.toString()+ "\nRA= " + this.ra;
    }   
}
