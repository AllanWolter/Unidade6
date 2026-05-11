import java.util.Scanner;

public class Uni06Exe01 {
    public Uni06Exe01() {
        int vetor[] = new int[10];
        lerdados(vetor);
        escreverdados(vetor);
    }

    private void lerdados(int vetor[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }
        sc.close();
    }

    private void escreverdados(int vetor[]) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        new Uni06Exe01();
    }
}