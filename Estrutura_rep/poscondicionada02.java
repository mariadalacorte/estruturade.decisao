package Estrutura_rep;

import java.util.Random;

public class poscondicionada02 {

	public static void main(String[] args) {
		Random random = new Random();
		int faceDado;
		
		do {
			faceDado = random.nextInt(7);
			System.out.println("Face do dado: " + faceDado);
		} while (faceDado != 6);


	}

}
