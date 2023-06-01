package maiorposicao;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		System.out.println("Digite um número: ");
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextInt();
		}

		int maior = vetor[0];
		int posicaoMaior = 0;

		for (int i = 0; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição de maior valor: " + posicaoMaior);

		sc.close();

	}

}
