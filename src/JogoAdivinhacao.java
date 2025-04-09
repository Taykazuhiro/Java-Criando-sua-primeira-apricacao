import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int tentativa;
        int numeroDeTentativas = 5;

        while (numeroDeTentativas > 0){
            System.out.println("Adivinhe o número secreto entre 0 e 100: ");
            tentativa = scanner.nextInt();

            if(tentativa == numeroAleatorio){
                System.out.println("Parabéns, você acertou! O número aleatório é: " + numeroAleatorio);
            } else if (numeroDeTentativas == 1) {
                System.out.println("Acabaram suas tentativas :( O número aleatório era: " + numeroAleatorio);
                break;
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Sua tentativa é maior do que o número secreto.");
                numeroDeTentativas--;
                System.out.println("Número de tentativas restantes: "+ numeroDeTentativas);
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Sua tentativa é menor do que o número secreto.");
                numeroDeTentativas--;
                System.out.println("Número de tentativas restantes: " + numeroDeTentativas);

            }

        }

            }

        }

