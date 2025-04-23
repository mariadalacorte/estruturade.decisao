package exercicio_aula12;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Infome um número: ");
		int num = ler.nextInt();
		System.out.print("Infome o nome: ");
		String nome = ler.next();
		
		for (int i = 1; i <=10; i++) {
			System.out.println(num +  nome);
		}

	}

}
