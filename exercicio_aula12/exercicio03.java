package exercicio_aula12;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		System.out.print("Infome seu nome de usuário: ");
		String nome = ler.nextLine();
		for (int i = 1; i <=10; i++) {
		System.out.println(nome);
		}
		

	}

}
