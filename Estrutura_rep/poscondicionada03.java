package Estrutura_rep;

import java.util.Scanner;

public class poscondicionada03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		do {
			System.out.print("Digite um numero: "); 
			numero = ler.nextInt();
		} while (numero != 0);
		
		System.out.println("Você digitou: " + numero + " para terminar");
		ler.close();

	}

}
