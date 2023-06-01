package abaixodamedia;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n;

		System.out.println("Quantos elementos vai ter no vetor?");
		n = sc.nextInt();

		double[] num = new double[n];

		System.out.println("Digite um número: ");
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextDouble();
		}

		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += num[i];
		}
		
		double media = (double) soma / n;
		
		System.out.println("A média dos vetores é: " + media);
		
		double abaixoMedia=0;
		for (int i=0; i<n; i++) {
			if (num[i] < media) {
				System.out.println("Elementos abaixo da média: " + num[i]);
			}
		}
		

		sc.close();
	}

}
