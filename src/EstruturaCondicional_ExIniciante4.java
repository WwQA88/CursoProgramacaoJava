import java.util.Scanner;

public class EstruturaCondicional_ExIniciante4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horainij;
		int horafinj;
		int dia = 24;
		int durjogo;

		horainij = sc.nextInt();
		horafinj = sc.nextInt();

		if (horainij < horafinj) {
			durjogo = horafinj - horainij;
			System.out.println("O JOGO DUROU " + durjogo + " HORA(S)");

		}
		
		else {
			
			durjogo = dia - horainij + horafinj;
			System.out.println("O JOGO DUROU " + durjogo + " HORA(S)");
		}
		
		

		sc.close();
		
		
	}
}

// ------------------------ CORREÇÃO

//		Scanner sc = new Scanner(System.in);
//
//		int horaInicial = sc.nextInt();
//		int horaFinal = sc.nextInt();
//		
//		int duracao;
//		if (horaInicial < horaFinal) {
//			duracao = horaFinal - horaInicial;
//		}
//		else {
//			duracao = 24 - horaInicial + horaFinal;
//		}
//		
//		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
//		
//		sc.close();
