package atividade5java;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList1 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		 * Classe String. O programa deverá solicitar ao usuário, que ele digite via
		 * teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em
		 * seguida, faça o que se pede:
		 * 
		 * Mostre na tela todas as cores que foram adicionadas. Mostre na tela todas as
		 * cores que foram adicionadas ordenadas em ordem crescente.
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String elemento;

		for (int i = 0; i < 5; i++) {
			System.out.printf("Escreva a %dª cor: \n", i + 1);
			elemento = leia.nextLine(); 
			cores.add(elemento);
		}
		
		System.out.println();
		
		System.out.println("Listar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println();
		
		cores.sort(null);
		
		System.out.println("Ordenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		

	}

}
