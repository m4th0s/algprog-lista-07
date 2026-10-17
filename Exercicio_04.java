import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] eficiencia = new double[3][5];
        double soma = 0;

        System.out.println("EXERCÍCIO 4");
        System.out.println("Digite a eficiência dos 15 painéis:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                System.out.print("Painel [" + linha + "][" + coluna + "]: ");
                eficiencia[linha][coluna] = sc.nextDouble();

                soma = soma + eficiencia[linha][coluna];
            }
        }

        double media = soma / 15;

        System.out.println("Média dos painéis: " + media);
        System.out.println("Painéis abaixo da média:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                if (eficiencia[linha][coluna] < media) {
                    System.out.println(
                        "[" + linha + "][" + coluna + "] = "
                        + eficiencia[linha][coluna]
                    );
                }
            }
        }

        sc.close();
    }
}