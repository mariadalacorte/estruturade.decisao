package projetos_LPA.aula03;

import java.util.Scanner;

public class Aula_soma {

	public static void main(String[] args) {
		//variáveis
		double a, b, soma;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//entrada de dados
		System.out.println("Infome valor 1: ");
		a = ler.nextDouble();

		System.out.println("infome valor 2: ");
		b = ler.nextDouble();

		//processamento
		soma = a + b;
		
		//saída
		System.out.println("O resultado é:" + soma);
	}

}
