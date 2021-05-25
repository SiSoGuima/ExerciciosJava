package lista01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int ano;
		System.out.println("Olá vamos ver o quão velho voce será!");
		System.out.println("Digite o ano que vc nasceu!");
		
		ano = leitor.nextInt();
		System.out.println("Em 31 de dezembro de 2021 vc terá " + (2021 - ano) + " anos");
		
		leitor.close();		
	
	}

}
