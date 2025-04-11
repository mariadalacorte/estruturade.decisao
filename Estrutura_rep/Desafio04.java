package Estrutura_rep;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double media = 0, soma = 0, num;
		int i = 1;

		do{
			System.out.print("Informe o " + i + "°número: ");
			num = ler.nextDouble();
			soma = soma + num;
			System.out.println(i++);

		}while (i <= 2);
		
		media = soma / 5;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		
	}

	}


