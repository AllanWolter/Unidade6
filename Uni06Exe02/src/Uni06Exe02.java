import java.util.Scanner;

public class Uni06Exe02 {
    public Uni06Exe02(){
        Scanner sc = new Scanner(System.in);
       double vetor[] = new double[12];

        lervalores(sc, vetor);

        double media = calcularmedia(vetor);

        valormaiormedia(vetor, media);

        sc.close();
    }
    private void lervalores(Scanner sc, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) +"º valor: ");
            vetor[i] = sc.nextDouble();
        }    
    }
    private double calcularmedia(double vetor[]){
        double soma = 0;
         for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / (vetor.length);
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Valor da posição " + (i + 1) + ": " + vetor[i]);
        }
        return media;
    }
    private void valormaiormedia(double vetor[], double media){
        System.out.println("A média dos valores é: " + media);
        for (int i = vetor.length - 1; i >= 0; i--){
            if (vetor[i] > media) {
                System.err.println("O valor " + vetor[i] +" é maior que a média");
            }
        }
    }

    public static void main(String[] args) {
        new Uni06Exe02();
    }
}
