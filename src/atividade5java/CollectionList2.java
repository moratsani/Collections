package atividade5java;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		 * Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa
		 * deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e
		 * caso ele seja encontrado no ArrayList, exiba na tela a posição deste número
		 * na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a
		 * mensagem: O número NN não foi encontrado!
		 */
		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> valores = new ArrayList<Integer>();
		Integer numero = Integer.valueOf(10);
		int procura = 0;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Entre com o %dº número: \n",i + 1);
			numero = leia.nextInt();
			valores.add(numero);
		}

		System.out.println("Digite o número que você deseja procurar: ");
		procura = leia.nextInt();

		if (valores.contains(procura)) {
			System.out.println("O número " + procura + " foi encontrado! E está na posição: " + valores.indexOf(procura)
					+ " do índice!");
		} else {
			System.out.println("O número "+procura+" não foi encontrado!");
		}

	}

}
