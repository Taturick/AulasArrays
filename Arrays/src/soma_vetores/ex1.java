package soma_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;

		System.out.println("Quantos valores vai ter cada vetor:");
		n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
 
		
		System.out.println("Digite os valores de A:");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores de B:");
		for (int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println("Vetor resultante: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%d\n", c[i]);
		}
		
		
		sc.close();
	}

}
