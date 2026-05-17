public class Principal {

    public static void main(String[] args) {
        Cartao vetor[] = new Cartao[3];
        Data data[] = new Data[3];
        Endereco endereco[] = new Endereco[3];

        data[0] = new Data(22, 1, 2026);
        endereco[0] = new Endereco("Rua A", 175, "Ponta Grossa");
        vetor[0] = new Aniversario("Julieta", "Romeu", endereco[0], data[0]);
        data[1] = new Data(25, 12, 2026);
        endereco[1] = new Endereco("Rua B", 200, "Ponta Grossa");
        vetor[1] = new Natal("Romeu", "Julieta", endereco[1], data[1]);
        data[2] = new Data(12, 6, 2013);
        endereco[2] = new Endereco("Rua A", 175, "Ponta Grossa");
        vetor[2] = new Namorado("Romeu", "Julieta", endereco[2], data[2]);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i].mostraMensagem();
        }
    }
}