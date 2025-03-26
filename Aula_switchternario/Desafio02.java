package Aula_switchternario;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String mes;
		System.out.println("Informe o número do mês: ");
		mes = ler.next();
		
		switch (mes) {
		case "Janeiro":
		     System.out.println("O mês é 1");
		break;
		case "Fevereiro":
		     System.out.println("O mês é 2");
		break;
		case "Março":
		     System.out.println("O mês é 3");
		break;
		case "Abril":
	         System.out.println("O mês é 4");
	    break;
	    case "Maio":
	         System.out.println("O mês é 5");
	    break;
	    case "Junho":
	         System.out.println("O mês é 6");
	    break;
	    case "Julho":
             System.out.println("O mês é 7");
        break;
        case "Agosto":
             System.out.println("O mês é 8");
        break;
        case "Setembro":
             System.out.println("O mês é 9");
        case "Outubro":
             System.out.println("O mês é 10");
        break;
        case "Novembro":
             System.out.println("O mês é 11");
        break;
        case "Dezembro":
             System.out.println("O mês é 12");
        default:
             System.out.println("Mês inválido!");
		}
		

	}

}
