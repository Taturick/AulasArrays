package negativos;


import java.util.Scanner;

public class ex1chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem lidos (máximo 10): ");
        int n = sc.nextInt();

        // Verifica se o valor de N está dentro do limite permitido
        if (n <= 0 || n > 10) {
            System.out.println("Quantidade inválida. Digite um valor entre 1 e 10.");
            return;
        }

        int[] numeros = new int[n];

        // Lê os N números inteiros e os armazena no vetor
        System.out.println("Digite os " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números negativos lidos:");

        // Exibe os números negativos do vetor
        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
