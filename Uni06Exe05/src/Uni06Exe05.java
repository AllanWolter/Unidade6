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

    private void lerRespostas(String vetorRapaz[], String vetorMoça[], Scanner sc) {
        System.out.println("Entradas: sim, não, ind (indiferente)");
        System.out.println("Gostos do Rapaz:");
        System.out.println("Gosta de música sertaneja?");
        vetorRapaz[0] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta de futebol?");
        vetorRapaz[1] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta de seriados?");
        vetorRapaz[2] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta de redes sociais?");
        vetorRapaz[3] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta da Oktoberfest?");
        vetorRapaz[4] = removerAcentos(sc.next().toLowerCase());

        System.out.println("Gostos da Moça:");
        System.out.println("Gosta de música sertaneja?");
        vetorMoça[0] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta de futebol?");
        vetorMoça[1] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta de seriados?");
        vetorMoça[2] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta de redes sociais?");
        vetorMoça[3] = removerAcentos(sc.next().toLowerCase());
        System.out.println("Gosta da Oktoberfest?");
        vetorMoça[4] = removerAcentos(sc.next().toLowerCase());
    }

    private int calcularAfinidade(String vetorRapaz[], String vetorMoça[]) {
        int indiceAfinidade = 0;
        for (int i = 0; i < 4; i++) {
            if (vetorRapaz[i].equals(vetorMoça[i])) {
                indiceAfinidade += 3;
            } else if ((!vetorRapaz[i].equals(vetorMoça[i]) && vetorRapaz[i].equals("ind"))
                    || (!vetorMoça[i].equals(vetorRapaz[i]) && vetorMoça[i].equals("ind"))) {
                indiceAfinidade += 1;
            } else if ((!vetorRapaz[i].equals(vetorMoça[i]) && !vetorRapaz[i].equals("ind"))
                    || (!vetorMoça[i].equals(vetorRapaz[i]) && !vetorMoça[i].equals("ind"))) {
                indiceAfinidade -= 2;
            }
        }
        return indiceAfinidade;
    }

    private void escreverAfinidade(int indiceAfinidade) {
        if (indiceAfinidade >= 15) {
            System.out.println("Casem!");
        } else if (indiceAfinidade >= 10 && indiceAfinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (indiceAfinidade >= 5 && indiceAfinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (indiceAfinidade >= 0 && indiceAfinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (indiceAfinidade <= -1 && indiceAfinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else if (indiceAfinidade <= -10) {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        new Uni06Exe05();
    }
}
