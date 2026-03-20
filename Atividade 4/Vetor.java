public class Vetor {

    public static void somar(int vetor[]) {
        int soma = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("Soma é " + soma);
    }

    public static void media(int vetor[]) {
        int soma = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        System.out.printf("Média e %.2f\n", (float) soma / vetor.length);
    }

    public static void imprimir(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void buscaSequencial(int vetor[], int chave) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.println("Elemento encontrado na posição " + i);
                return;
            }
        }
        System.out.println("Elemento não encontrado");
    }
}