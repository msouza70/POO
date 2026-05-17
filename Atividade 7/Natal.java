public class Natal extends Cartao {

    public Natal(String remetente, String destinatario, Endereco endereco, Data data) {
        super(remetente, destinatario, endereco, data);
    }

    public String mensagem() {
        return "Feliz Natal!";
    }

}