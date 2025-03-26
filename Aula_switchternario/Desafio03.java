package Aula_switchternario;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o número: ");
		int numero = ler.nextInt();
		 
		String msg = numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(msg);
	}

}
