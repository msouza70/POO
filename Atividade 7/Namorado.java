public class Namorado extends Cartao {

    public Namorado(String remetente, String destinatario, Endereco endereco, Data data) {
        super(remetente, destinatario, endereco, data);
    }

    public String mensagem() {
        return "Feliz dia dos Namorados!";
    }

}
