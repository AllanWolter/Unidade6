import java.util.Scanner;

public class Uni05Exe03 {
    public Uni05Exe03() {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[12];

        lervalores(sc, vetor);

        calcularvalores(vetor);

        escrevervalores();

        sc.close();

    }
    private void lervalores(Scanner sc, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) +"º valor: ");
            vetor[i] = sc.nextDouble();
        }
    }
    private void calcularvalores(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if ((vetor[i] % 2) == 0){
                vetor[i] *= 1.02;
            } else {
                vetor[i] *= 1.05;
            }
        } 
    }
    private void escrevervalores() {
        for (int i = 0; i < vetor.length; i++) {

            System.out.println(vetor[i]);
    }
    

    public static void main(String[] args) {
       new Uni05Exe03(); 
    }
}
