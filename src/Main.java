public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento:" + ano);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
                Filme top gun
                Filme de aventura com galã dos anos 80
                Ano de lançamento:
                """ + ano;

        System.out.println(sinopse);
         int estrelas = (int) (media/2);
        System.out.println(estrelas);

    }
}