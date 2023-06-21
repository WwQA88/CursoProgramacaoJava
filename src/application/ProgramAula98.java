package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramAula98 {

	public static void main(String[] args) {

		// Listas

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// Exemplo Adicionar um elemento na posicao 2
		list.add(2, "Marco");

		// Exibir tamanho da lista
		System.out.println(list.size());

		// Remover algum elemento da lista
		// list.remove("Anna");
		// list.remove(1);

		for (String x : list) {
			System.out.println(x);

		}

		System.out.println("----------------------------------");

		// Remover algum item da lista por Predicado.
		// Exemplo: todos que comecam com a letra M
		list.removeIf(x -> x.charAt(0) == 'M'); // Instrucao lambda

		for (String x : list) {
			System.out.println(x);

		}

		System.out.println("----------------------------------");

		// Encontrar a posicao do elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Procurar por alguem que nao exista na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("----------------------------------");

		// Permanecer na lista somente quem tem o nome iniciado por A

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);

		}

		System.out.println("----------------------------------");
		// Encontrar um elemento da lista que atenda a um certo predicado

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

		System.out.println("----------------------------------");

		// Caso nao encontre o elemento na lista, retorna nulo
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);

	}

}
