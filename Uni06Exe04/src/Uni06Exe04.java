import java.util.Scanner;

public class Uni06Exe04 {
    public Uni06Exe04() {
        Scanner sc = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];

        lervetores(vetor1, vetor2, sc);
        calcularvetores(vetor1, vetor2, vetor3);
        escrevervetores(vetor3);

    }

    private void lervetores(int vetor1[], int vetor2[], Scanner sc) {

        System.out.println("Digite os valores do primeiro vetor ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do segundo vetor ");
        for (int j = 0; j < vetor2.length; j++) {
            System.out.print("Digite o " + (j + 1) + "° valor: ");
            vetor2[j] = sc.nextInt();
        }
    }

    private void calcularvetores(int vetor1[], int vetor2[], int vetor3[]) {
        for (int k = 0; k < vetor3.length; k++) {
            vetor3[k] = vetor1[k] + vetor2[k];
        }
    }

    private void escrevervetores(int vetor3[]) {
        System.out.println("Os novos valores do terceiro vetor são ");
        for (int l = 0; l < vetor3.length; l++) {
            System.out.println((l + 1) + " - [" + vetor3[l] + "]");
        }

    }

    public static void main(String[] args) {
        new Uni06Exe04();
    }
}
