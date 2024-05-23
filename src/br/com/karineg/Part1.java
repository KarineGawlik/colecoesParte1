package br.com.karineg;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Part1 {
	public static void main(String[] args) {
		//scanner para o usuário escrever na tela
		Scanner scanner = new Scanner(System.in);
		
		//imprime a orientação na tela do usuário
		System.out.println("Digite os nomes que deseja adicionar na lista, separar os nomes por vírgula: ");
		
		//pega a resposta de entrada na tela 
		String input = scanner.nextLine();
		
		//pega os nomes e tira a vírgula 
		String[] names = input.split(",");
		
		//metodo map para definir os valores do tipo string e ordenar os nomes 
		Map<String, String> sortedNames = new TreeMap<>();
		
		for (String name: names) {
			sortedNames.put(name.trim(), name.trim());
		}
		System.out.println("\nSegue a sua lista em ordem alfabética:");
		
		for (String name : sortedNames.values()) {
			System.out.println(name);
		}
		
	}
}
