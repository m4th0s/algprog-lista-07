public class Exercicio_05 {
    public static void main(String[] args) {
        int[][] tempo = {
            {12, 15, 18, 20},
            {10, 14, 16, 22},
            {9, 13, 17, 25},
            {8, 11, 19, 27}
        };

        int somaBorda = 0;

        System.out.println("\nEXERCÍCIO 5");
        System.out.println("Matriz:");

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(tempo[linha][coluna] + " ");
            }
            System.out.println();
        }

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (linha == 0 || linha == 3 || coluna == 0 || coluna == 3) {
                    somaBorda = somaBorda + tempo[linha][coluna];
                }
            }
        }

        System.out.println("Soma dos elementos da borda: " + somaBorda);
    }
}
