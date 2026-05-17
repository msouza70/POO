public class Endereco {

    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Número inválido");
        }
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString() {
        return this.rua + ", " + this.numero + ". " + this.cidade;
    }

}