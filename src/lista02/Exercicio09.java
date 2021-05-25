


package lista02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//Para uma sequência matemática onde cada elemento é calculado da seguinte forma:
		// 1!/N! ; 
		// 2!/(N-1)!;
		// 3!/(N-2)!; ... ; (N! / 1!)
		//Crie um programa onde o usuário digite a quantidade de elementos que deseja exibir 
		//e sejam exibidos os elementos da sequência.
		
		Scanner leitor = new Scanner(System.in);
		@SuppressWarnings("unused")
		int num = 0, fat = 1, result;
		System.out.println("Informe um numero: ");
		num = leitor.nextInt();
		
		while ( num > 1 ) {
	
			System.out.println(
					result = (fat *(fat*fat)) /  (num *(num*num))
			);
			num --;
			fat ++;
			
		}
		
		leitor.close();
		
	}

}
