public class Exercicio_02 {
    public static void main(String[] args) {

        int[][] conteudo = {
            {0, 1, 0, 2, 1},
            {1, 0, 2, 0, 0},
            {2, 1, 1, 0, 2},
            {0, 0, 1, 1, 0},
            {2, 0, 0, 1, 2}
        };

        int seguros = 0;
        int suspeitos = 0;
        int nocivos = 0;

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                if (conteudo[linha][coluna] == 0) {
                    seguros++;
                } else if (conteudo[linha][coluna] == 1) {
                    suspeitos++;
                } else {
                    nocivos++;
                    conteudo[linha][coluna] = -1;
                }
            }
        }

        System.out.println("Conteudos seguros: " + seguros);
        System.out.println("Conteudos suspeitos: " + suspeitos);
        System.out.println("Conteudos nocivos: " + nocivos);

        System.out.println("Matriz depois da remocao:");

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(conteudo[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}