package lista01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Solicite ao usu�rio a digita��o de 2 n�meros inteiros,
		nas vari�veis A e B. Sem usar uma terceira vari�vel, troque os valores de A e B entre si.*/
		Scanner leitor = new Scanner(System.in);
		int a, b;
		System.out.println("Digite valor do caracter A: ");
		a = leitor.nextInt();
		System.out.println("Digite valor do caracter B: ");
		b = leitor.nextInt();
		System.out.println("Agora caracter A vale: " + a);
		System.out.println("Agora caracter B vale: " + b);
		System.out.println("Trocando valores ... ");
		a = a + b;	
		b = a - b; 	
		a = a - b;
		System.out.println("Agora caracter A vale: " + a);
		System.out.println("Agora caracter B vale: " + b);
		
		leitor.close();	

	}

}
