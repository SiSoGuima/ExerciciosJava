package lista01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, 
		//solicite ao usuário que digite o tempo de um filme em minutos e informe a duração desse filme em horas e em segundos.

		Scanner leitor = new Scanner(System.in);
		int tempo, segundos, hora;
		System.out.println("Digite o tempo do filme em minutos!");
		
		tempo = leitor.nextInt();
		hora = (tempo/60);
		segundos =  (tempo * 60) - (hora * (60*60));
			
		System.out.println("O filme terá " + hora + " hora(s) e " + segundos  + " segundos!" );
		
		leitor.close();	
		
	}

}
