
package lista02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// No parque Valter Dino World, os clientes podem ter a chance de passar uma noite
		//no castelo da princesa Javarella. Para isso, devem acertar quantos feijões estão em um jarro (1238).
		//Faça um programa que solicite a digitação da quantidade de feijões até que um cliente acerte.
		
		Scanner leitor = new Scanner(System.in);
		int qtdFeijoes = 0;

		
		//System.out.println("Digite quantos feijoes há no jarro ");
		//qtdFeijoes = leitor.nextInt();
		
		while (qtdFeijoes != 1238) {
			System.out.println("Digite quantos feijoes há no jarro ");
			qtdFeijoes = leitor.nextInt();
			System.out.println("Errou tente novamente ");
			
		}
		System.out.println("Parabens vc acertou!!!");
		
		leitor.close();
		
	}

}
