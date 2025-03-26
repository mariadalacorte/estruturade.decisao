package Aula_switchternario;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String s, l;
		String login = "Maria";
		String senha = "123456";
		
		System.out.println("Digite seu login: ");
		l = ler.next();
		System.out.println("Digite sua senha: ");
		s = ler.next();
		
		System.out.println (login.equals(l) && (senha.equals(s)) ? "Seja bem-vinda" : "Acesso inválido.");
		

	}

}
