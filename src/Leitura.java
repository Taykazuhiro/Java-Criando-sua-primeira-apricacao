import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual a sua avaliação do filme?");
        double avaliacao = leitura.nextDouble();
        String mensagem = String.format("O filme é %s, lançado em %d e sua avaliação é %.2f", filme,anoDeLancamento,avaliacao);
        System.out.println(mensagem);

    }
}
