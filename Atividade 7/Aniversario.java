public class Aniversario extends Cartao {

    public Aniversario(String remetente, String destinatario, Endereco endereco, Data data) {
        super(remetente, destinatario, endereco, data);
    }

    public String mensagem() {
        return "Feliz Aniversario!";
    }
}