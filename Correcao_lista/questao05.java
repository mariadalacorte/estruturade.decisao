package Correcao_lista;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		for (int i = 1; i <=8; i++) {
			System.out.print("Infome seu nome: ");
			String nome = ler.next();
			System.out.println("Infome sua idade: ");
			int idade = ler.nextInt();
			
		if (idade >=18) {
			System.out.println("");
			System.out.println("=> Seu nome é: " + nome + " e sua idade é: " + idade);
			System.out.println("");
		}
		}
		ler.close ();
	}
	

}
