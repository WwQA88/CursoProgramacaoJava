import java.util.Scanner;

public class EstruturaCondicional_ExIniciante5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codItem;
		double precoItem1 = 4.00;
		String descItem1 = "Cachorro Quente";

		double precoItem2 = 4.50;
		String descItem2 = "X-Salada";

		double precoItem3 = 5.00;
		String descItem3 = "X-Bacon";

		double precoItem4 = 2.00;
		String descItem4 = "Torrada Simples";

		double precoItem5 = 1.50;
		String descItem5 = "Refrigerante";

		int qtdeItem;

		System.out.println("BEM VINDO A LOJA DO WW!");
		System.out.println("");
		System.out.println("SELECIONE 1 OU MAIS ITENS E SUAS QUANTIDADES CONFORME TABELA ABAIXO:");
		System.out.println("");
		System.out.println("CODIGO " + "ESPECIFICACAO" + "      PRECO");
		System.out.println("");
		System.out.println("1      " + "Cachorro Quente" + "    R$ 4.00");
		System.out.println("2      " + "X-Salada" + "           R$ 4.50");
		System.out.println("3      " + "X-Bacon" + "            R$ 5.00");
		System.out.println("4      " + "Torrada Simples" + "    R$ 2.00");
		System.out.println("5      " + "Refrigerante" + "       R$ 1.50");
		System.out.println("");

		System.out.println("SELECIONE UM ITEM DA TABELA DE ACORDO COM O CODIGO: ");
		codItem = sc.nextInt();

		System.out.println("SELECIONE A QUANTIDADE: ");
		qtdeItem = sc.nextInt();

		if (codItem < 1 || codItem > 5) {
			System.out.println("CODIGO NAO ENCONTRADO");
		}
		else if (codItem == 1) {
			System.out.println("VOCE SELECIONOU O ITEM " + descItem1);
			double precoTotal = qtdeItem * precoItem1;
			System.out.printf("Total R$: %.2f%n", precoTotal);
		}
		else if (codItem == 2) {
			System.out.println("VOCE SELECIONOU O ITEM " + descItem2);
			double precoTotal = qtdeItem * precoItem2;
			System.out.printf("Total R$: %.2f%n", precoTotal);
		}
		else if (codItem == 3) {
			System.out.println("VOCE SELECIONOU O ITEM " + descItem3);
			double precoTotal = qtdeItem * precoItem3;
			System.out.printf("Total R$: %.2f%n", precoTotal);
		}
		else if (codItem == 4) {
			System.out.println("VOCE SELECIONOU O ITEM " + descItem4);
			double precoTotal = qtdeItem * precoItem4;
			System.out.printf("Total R$: %.2f%n", precoTotal);
		}
		else {
			System.out.println("VOCE SELECIONOU O ITEM " + descItem5);
			double precoTotal = qtdeItem * precoItem5;
			System.out.printf("Total R$: %.2f%n", precoTotal);
		}

		sc.close();

	}
}
