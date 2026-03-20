import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {

        Scanner leitura = new Scanner(System.in);
        int valor;
        int posicao;

        int vet[] = {5, 18, 3, 9, 22};

        Vetor.media(vet);

        System.out.println("Busca sequencial");
        System.out.print("Digite um número inteiro: ");
        valor = leitura.nextInt();
        Vetor.buscaSequencial(vet, valor);
        Arrays.sort(vet);
        System.out.println("Vetor foi ordenado!");
        System.out.println("Busca binária");
        System.out.print("Digite um número inteiro: ");
        valor = leitura.nextInt();
        posicao = Arrays.binarySearch(vet, valor);
        if (posicao < 0) {
            System.out.println("Elemento não encontrado");
        } else {
            System.out.println("Elemento encontrado na posição " + posicao);
        }
        Vetor.imprimir(vet);
    }
}