package atividade5java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java para criar uma Collection Set de Objetos da
		 * Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa
		 * deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro
		 * e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00
		 * Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela
		 * a mensagem: O número NN não foi encontrado!
		 */
		Scanner leia = new Scanner(System.in);

		Set<Integer> num = new HashSet<Integer>();
		Integer numero = Integer.valueOf(10);
		int procura = 0;

		for (int i = 0; i < 10; i++) {
			numero = i;
			num.add(numero);
		}

		System.out.println("Digite o número que você deseja procurar: ");
		procura = leia.nextInt();

		if (num.contains(procura)) {
			System.out.println("O número " + procura + " foi encontrado!");
		} else {
			System.out.println("O número "+ procura +" não foi encontrado!");
		}

	}

}
