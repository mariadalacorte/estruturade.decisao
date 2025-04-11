package Estrutura_rep;

import java.util.Scanner;

public class Desafio01pos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double media = 0, soma = 0, num;

		for (int i = 1; i <= 2; i++) {
			System.out.print("Informe o " + i + "°número: ");
			num = ler.nextDouble();
			soma = soma + num;
		}
		media = soma / 5;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
	}

}
