
package lista02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// No parque Valter Dino World, os clientes podem ter a chance de passar uma noite
		//no castelo da princesa Javarella. Para isso, devem acertar quantos feij�es est�o em um jarro (1238).
		//Fa�a um programa que solicite a digita��o da quantidade de feij�es at� que um cliente acerte.
		
		Scanner leitor = new Scanner(System.in);
		int qtdFeijoes = 0;

		
		//System.out.println("Digite quantos feijoes h� no jarro ");
		//qtdFeijoes = leitor.nextInt();
		
		while (qtdFeijoes != 1238) {
			System.out.println("Digite quantos feijoes h� no jarro ");
			qtdFeijoes = leitor.nextInt();
			System.out.println("Errou tente novamente ");
			
		}
		System.out.println("Parabens vc acertou!!!");
		
		leitor.close();
		
	}

}
