package projetos_LPA.aula03;

import java.util.Scanner;

public class Aula_nomeidade {

	public static void main(String[] args) {
		//variáveis
		double idade;
		String nome;
		
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//entrada de dados
		System.out.println ("Informe o nome:");
		nome = ler.next();
		
		System.out.println("infome a idade: ");
		idade = ler.nextDouble();

		//saída
		System.out.println("nome é:  " + nome + "   " +  "idade é: " + idade);

	}

}
