package exercicio_aula12;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
        int somador = 0, num;
		
		for (int i = 1; i<=15; i++) {
		    System.out.println("Informe um número: ");
		    num = ler.nextInt();
		    somador = somador + num;
		}
		System.out.println("O resultado da soma é: " + somador);


	}

}

