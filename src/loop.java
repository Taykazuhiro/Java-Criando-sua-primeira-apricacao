import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação do filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliação " + mediaAvaliacao/3);

    }
}
