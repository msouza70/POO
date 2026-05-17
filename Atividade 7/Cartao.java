public abstract class Cartao {

    private String remetente;
    private String destinatario;
    private Endereco endereco;
    private Data data;

    public Cartao(String remetente, String destinatario, Endereco endereco, Data data) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.data = data;
    }

    public abstract String mensagem();

    public void mostraMensagem() {
        System.out.println("============================================");
        System.out.println(this.data);
        System.out.println("Para: " + this.destinatario);
        System.out.println(this.endereco);
        System.out.println("\n\n\t\t" + mensagem());
        System.out.println("\n\n\t\t\tDe: " + this.remetente);
        System.out.println("============================================");

    }

    public String getRemetente() {
        return this.remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

}
