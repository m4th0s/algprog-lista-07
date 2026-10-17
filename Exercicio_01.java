public class Exercicio_01 {

    public static void main(String[] args) {
        
        double[][] emissao = {
            {12.5, 13.2, 11.8, 14.1},
            {9.7, 10.5, 12.1, 11.6},
            {15.3, 14.8, 16.2, 15.9},
            {8.4, 9.1, 8.8, 10.0}
        };

        System.out.println("\nEXERCÍCIO 1");

        for (int linha = 0; linha < 4; linha++) {
            double soma = 0;

            for (int coluna = 0; coluna < 4; coluna++) {
                soma = soma + emissao[linha][coluna];
            }

            System.out.println("Total da filial " + (linha + 1) + ": " + soma);
        }

        // Soma de cada coluna: total de cada trimestre
        double maior = 0;
        int trimestreMaior = 0;

        for (int coluna = 0; coluna < 4; coluna++) {
            double soma = 0;

            for (int linha = 0; linha < 4; linha++) {
                soma = soma + emissao[linha][coluna];
            }

            System.out.println("Total do trimestre " + (coluna + 1) + ": " + soma);

            if (soma > maior) {
                maior = soma;
                trimestreMaior = coluna + 1;
            }
        }

        System.out.println("Trimestre com maior emissão: " + trimestreMaior);
    
    }
}