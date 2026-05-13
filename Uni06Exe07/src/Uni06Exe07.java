import java.util.Arrays;
import java.util.Scanner;

public class Uni06Exe07 {
    public Uni06Exe07() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidades de valores para o vetor: ");
        int n = sc.nextInt();
        while (n > 20 || n < 1) {
            System.out.println("Digite um valor até 20 posições: ");
            n = sc.nextInt();
        }
        int vetor[] = new int[n];
        lerValores(vetor, sc);
        escreverValores(vetor);
    }

    private boolean duplicado(int vetor[], int ate, int valor) {
        for (int j = 0; j < ate; j++) {
            if (vetor[j] == valor) {
                return true;
            }
        }
        return false;
    }

    private void lerValores(int vetor[], Scanner sc) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
            while (duplicado(vetor, i, vetor[i])) {
                System.out.print("O valor já existe no vetor, digite outro: ");
                vetor[i] = sc.nextInt();
            }
        }
    }

    private void escreverValores(int vetor[]) {
        System.out.print("Vetor origem: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.print("\nVetor ordenado: ");
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
    }

    public static void main(String[] args) throws Exception {
        new Uni06Exe07();
    }
}
