package Aula_switchternario;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;
		System.out.println("Informe o dia da semana: ");
		dia = ler.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("O dia da semana é Domingo");
		    break;
		case 2 :
			System.out.println("O dia da semana é Segunda");
			break;
		case 3:
			System.out.println("O dia da semana é Terça");
			break;
		case 4:
			System.out.println("O dia da seman é Quarta");
			break;
		case 5:
			System.out.println("O dia da semana é Quinta");
			break;
		case 6:
			System.out.println("O dia da semana é Sexta");
			break;
		case 7:
			System.out.println("O dia da semana é Sábado");
			break;
			default:
				System.out.println("Dia inválido!");
			
		}
		
		

	}

}
