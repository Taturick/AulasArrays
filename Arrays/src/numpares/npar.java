package numpares;

import java.util.Locale;
import java.util.Scanner;

public class npar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos números você vai digitar:");
		int n = sc.nextInt();

		int[] num = new int[n];

		System.out.println("Digite um número: ");
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("Números pares:");
		int quantidadesPares=0;
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
				quantidadesPares += num[i];
			}
		}

		System.out.println("A soma dos pares: " + quantidadesPares);

		sc.close();
		
	

	}

}
