package lista01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/*Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso.
		 *  Entre os pesos de 3 lixos informados pelo usu�rio, um programa deve indicar
		 *   qual deles deve ser carregado pelo drone.*/
		
		Scanner leitor = new Scanner(System.in);
		int p1, p2, p3;
		
		System.out.println("Digite peso lixo 1: ");
		p1 = leitor.nextInt();
		
		System.out.println("Digite peso lixo 2: ");
		p2 = leitor.nextInt();
		
		System.out.println("Digite peso lixo 3: ");
		p3 = leitor.nextInt();
		
		
		if (p1 < p2 && p1 < p3) {
			
		System.out.println("Drone levar� o lixo 1");
		
		}else if (p2 < p3 && p2 < p1) {
		
			System.out.println("Drone levar� o lixo 2");
			
			}else if (p3 < p1 && p3 < p2) {
				System.out.println("Drone levar� lixo 3");
			}
		
		leitor.close();	

	}

}