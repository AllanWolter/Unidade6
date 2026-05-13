import java.util.Scanner;

public class Uni06Exe06 {
    public Uni06Exe06() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidades de valores para o vetor: ");
        int n = sc.nextInt();
        double vetor[] = new double[n];
        lervetor(vetor, sc);
        encontrarvetor(vetor, sc);
    }

    private void lervetor(double vetor[], Scanner sc) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextDouble();
        }
    }

    private void encontrarvetor(double vetor[], Scanner sc) {
        
        System.out.print("Digite o valor que deve ser verificado: ");
        double d = sc.nextDouble();
        boolean encontrado = false;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == d) {
                encontrado = true;
                break;
            } 
        }
        if (encontrado) {
            System.out.println("O valor " + d + " se encontra no vetor.");
        } else {
            System.out.println("O valor " + d + " não se encontra no vetor.");  
        }
              
    }

    public static void main(String[] args) throws Exception {
        new Uni06Exe06();
    }
}
