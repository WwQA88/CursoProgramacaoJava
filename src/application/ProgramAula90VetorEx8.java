package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int somaPares = 0;
		int nPares = 0;
		double mediaPares = 0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] % 2 == 0) {
				
				somaPares = somaPares + vetor[i];
				nPares ++;
			}
		}
		
		if(nPares == 0) {
			
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			
			mediaPares = (double) somaPares / nPares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}

		sc.close();

	}

}
