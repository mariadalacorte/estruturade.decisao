package Correcao_lista;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1, num2, resul;
		
		System.out.println("Informe o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = ler.nextInt();
		
		resul = num1 + num2;
		
		System.out.println("O resultado da soma é: ");
		ler.close();

	}

}
