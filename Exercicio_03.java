public class Exercicio_03 {
    public static void main(String[] args) {
        double[][] temperatura = {
            {28.4, 30.1, 29.8, 31.2},
            {27.9, 32.5, 30.7, 29.4},
            {28.8, 31.6, 33.0, 30.2},
            {29.1, 28.7, 31.4, 32.1}
        };

        double maior = temperatura[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        double somaDiagonal = 0;

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (temperatura[linha][coluna] > maior) {
                    maior = temperatura[linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }

                if (linha == coluna) {
                    somaDiagonal = somaDiagonal + temperatura[linha][coluna];
                }
            }
        }

        System.out.println("\nEXERCÍCIO 3");
        System.out.println("Maior temperatura: " + maior + " graus");
        System.out.println("Posição: [" + linhaMaior + "][" + colunaMaior + "]");
        System.out.println("Média da diagonal: " + (somaDiagonal / 4));
    }
}
