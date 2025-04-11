package Estrutura_rep;

import java.util.Scanner;

public class Desafio01pre {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int fat = 1; 
		int i = 1;
		
		System.out.println("Indique o fatorial: ");
		int n = ler.nextInt();
		
		while (i <= n) {
		      fat = fat * i;
		      System.out.println(i++);
		}
		
		System.out.println("O fatorial é: " + fat);
		ler.close();

	}

}
