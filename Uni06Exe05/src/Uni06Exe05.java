import java.text.Normalizer;
import java.util.Scanner;

public class Uni06Exe05 {
    public Uni06Exe05() {
        Scanner sc = new Scanner(System.in);
        String vetorRapaz[] = new String[5];
        String vetorMoça[] = new String[5];
        lerRespostas(vetorRapaz, vetorMoça, sc);
        int indiceAfinidade = calcularAfinidade(vetorRapaz, vetorMoça);
        escreverAfinidade(indiceAfinidade);
    }

    private String removerAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\x00-\\x7F]", "");
    }

    private void lerResposta(String vetor[], int indice, Scanner sc) {
        String entrada;
        while (true) {
            entrada = removerAcentos(sc.next().toLowerCase());
            if (entrada.equals("sim") || entrada.equals("nao") || entrada.equals("ind")) {
                vetor[indice] = entrada;
                break;
            }
            System.out.println("Resposta inválida! Digite sim, nao ou ind.");
        }
    }

    private void lerRespostas(String vetorRapaz[], String vetorMoça[], Scanner sc) {
        String[] perguntas = {
                "Gosta de música sertaneja?",
                "Gosta de futebol?",
                "Gosta de seriados?",
                "Gosta de redes sociais?",
                "Gosta da Oktoberfest?"
        };

        System.out.println("Entradas válidas: sim, nao, ind (indiferente)");

        System.out.println("\nGostos do Rapaz:");
        for (int i = 0; i < 5; i++) {
            System.out.println(perguntas[i]);
            lerResposta(vetorRapaz, i, sc);
        }

        System.out.println("\nGostos da Moça:");
        for (int i = 0; i < 5; i++) {
            System.out.println(perguntas[i]);
            lerResposta(vetorMoça, i, sc);
        }
    }

    private int calcularAfinidade(String vetorRapaz[], String vetorMoça[]) {
        int indiceAfinidade = 0;
        for (int i = 0; i < 5; i++) {
            if (vetorRapaz[i].equals(vetorMoça[i])) {
                indiceAfinidade += 3;
            } else if (vetorRapaz[i].equals("ind") || vetorMoça[i].equals("ind")) {
                indiceAfinidade += 1;
            } else {
                indiceAfinidade -= 2;
            }
        }
        return indiceAfinidade;
    }

    private void escreverAfinidade(int indiceAfinidade) {
        if (indiceAfinidade >= 15) {
            System.out.println("Casem!");
        } else if (indiceAfinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (indiceAfinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (indiceAfinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (indiceAfinidade >= -9) {
            System.out.println("Melhor não perder tempo.");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        new Uni06Exe05();
    }
}
