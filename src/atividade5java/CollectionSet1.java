package atividade5java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet1 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java para criar uma Collection Set de Objetos da
		 * Classe Wrapper Integer. O programa deverá solicitar ao usuário, que ele
		 * digite via teclado 10 valores inteiros não repetidos e adicione-os
		 * individualmente na Collection Set. Em seguida, faça o que se pede:
		 * Mostre na tela todos os elementos da Collection Set, utilizando a
		 * Classe Iterator.
		 */
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> valores = new HashSet<Integer>();
		int elemento;
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Escreva o %dº valor: \n", i + 1);
			elemento = leia.nextInt(); 
			valores.add(elemento);
		}
		
		Iterator <Integer> iValores = valores.iterator();
		
		System.out.println("\nListando dados do Set: ");
		while(iValores.hasNext()) {
			System.out.println(iValores.next());
		}
	}

}
