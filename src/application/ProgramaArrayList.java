package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco"); //adiciona na segunda posição da lista o elemento marco
		
		System.out.println(list.size()); // Mostra o tamanho da lista
		
		for(String x : list) {// para CADA elemento da lista FAÇA
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		list.removeIf(x -> x.charAt(0)=='M'); //remover da lista se o primeiro caracter for M
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		System.out.println("Index of Bob:"+ list.indexOf("Bob"));// mostra o index (posição) do elemento procurado
		System.out.println("Index of Marco: "+list.indexOf("Marco"));//se o elemento procurado não existir na lista,retorna -1
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x ->x.charAt(0) == 'A').collect(Collectors.toList());// mostra apenas os elementos que estão dentro dessas especificações
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------");
		String name = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);
	}
	

}
