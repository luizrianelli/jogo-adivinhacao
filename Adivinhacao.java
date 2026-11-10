import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 0 e 100).");

        while (tentativas < 5) {
            System.out.print("Digite seu palpite: ");
            palpite = leitor.nextInt();
            tentativas++;

            if (palpite == numeroGerado) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (palpite < numeroGerado) {
                System.out.println("O número é maior!");
            } else {
                System.out.println("O número é menor!");
            }
        }

        if (tentativas == 5 && palpite != numeroGerado) {
            System.out.println("Que pena! Você não conseguiu acertar. O número era " + numeroGerado);
        }
    }
}
