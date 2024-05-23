package br.com.karineg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Instruções: \nEscreva o nome e o sexo da pessoa, separados por vírgulas, como o exemplo:\n'Karine Gawlik-F, João Azevedo-M'\n ");
		System.out.println("Escreva o nome e o sexo da pessoa que deseja adicionar a lista: ");
		
		//le a linha inteira de entrada do usuário como string
		String input = scanner.nextLine();
		
		//o split divide a string  usando a virgula como delimitador 
		String[] entries = input.split(",");
		
		//map mapeia os valores e o hashMap é a implementação da interface map (ela não ordena os elementos)
		Map<String, List<String>> genderGroups = new HashMap<>();
		
		//o put, adiciona uma entrada no mapa, separando os generos
		genderGroups.put("M", new LinkedList<>());
		genderGroups.put("F", new LinkedList<>());
		
		//esse laço de repetição pega a entrada = entries 
		for (String entry : entries) {
			
			//divide cada nome-sexo em um array de duas parte, usando o hífen como delimitador e o trim remove os espacos em branco
			String[] parts = entry.trim().split("-");
			
			//verifica se o nome foi dividido em duas partes (nome e genero)
			if (parts.length == 2) {
				
				//pega o nome 
				String name = parts[0].trim();
				
				//pega o genero, tira os espaços em branco e identifica independente do genero for escrito em letra maiuscula ou minuscula
				String gender = parts[1].trim().toUpperCase();
				
				//verifica se o genero está no mapa genderGroups
				if (genderGroups.containsKey(gender)) {
					
					//se estiver correto adiciona o nome a lista correspondente ao genero 
					genderGroups.get(gender).add(name);
				}
			}
		}
		
		for (Map.Entry<String, List<String>> group : genderGroups.entrySet()) {
			System.out.println("Grupo " + group.getKey() + ": " + group.getValue());
		}
	}
}
