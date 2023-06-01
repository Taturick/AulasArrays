package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos números você vai digitar: ");
		int n = input.nextInt();
		

		double[] numeros = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um numero " + (i + 1)+ ": ");
			numeros[i] = input.nextDouble();
		}
		
		System.out.println("Valores: ");
		for (double numero : numeros) {
			System.out.println(numero);
		}
		
		double soma = calcularSoma(numeros);
		double media = calcularMedia(numeros);
		
		System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
	}
		public static double calcularSoma(double[] vetor) {
			double soma = 0;
			for (double numero: vetor) {
				soma += numero;
			}
			return soma;
		}
		
		public static double calcularMedia(double[] vetor) {
			double soma = calcularSoma(vetor);
			double media = soma / vetor.length;
		
			return media;
		}
		

	
	}
