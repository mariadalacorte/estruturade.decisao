package Correcao_lista;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int altura, base, area;
		
		System.out.println("Informe a base do triângulo: ");
		base = ler.nextInt();
		System.out.println("Informe a altura do triângulo: ");
		altura = ler.nextInt();
		
		area = (base * altura) / 2;
		
		System.out.println("A área do triângulo é igual a: " + area);

	}

}
