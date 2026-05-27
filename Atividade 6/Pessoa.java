public class Pessoa {
    
    private String nome;
    private Data nascimento;
    private String telefone="Não tem";

    public Pessoa(String nome, Data nascimento, String telefone) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
    }

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "\nNome=" + nome + "\nData de Nascimento= " + nascimento + "\nTelefone=" + telefone;
    }
    
}
