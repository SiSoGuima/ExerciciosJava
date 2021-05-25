package lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom “DIADEFESTA”.
		 *  Faça um programa onde o funcionário digite o valor da compra e um cupom, 
		 *  informando o valor final a ser pago.*/
		
		Scanner leitor = new Scanner(System.in);
		double vlrCompra;
		String cupom;
		
		System.out.println("Digite valor da compra: ");
		vlrCompra = leitor.nextDouble();
		
		System.out.println("Digite seu cupom: ");
		cupom = leitor.next();
	
		
		if (cupom.equalsIgnoreCase("DIADEFESTA")) {
			
			vlrCompra = vlrCompra - (vlrCompra*0.03);
		}
		
		System.out.println("O valor da compra eh: R$" + vlrCompra);
			

		
		leitor.close();	

	}

}