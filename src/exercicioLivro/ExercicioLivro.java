package exercicioLivro;

import java.util.Scanner;

public class ExercicioLivro {

	public static void main(String[] args) {

		int opIniciojogo = 0, opaos7, opaos9 = 0, opaos12, opaos15, opaos17, opaos19, opaos21, opaos25;

		System.out.println("Bem vindo ao jogo da Vida!");
		System.out.println("Tome a decisão certa ... ");

		Scanner leitor = new Scanner(System.in);

		while (opIniciojogo != 4) {

			System.out.println("1 - Comecar jogo");
			System.out.println("2 - Apresentacao e Instrucoes");
			System.out.println("3 - Sair");

			opIniciojogo = leitor.nextInt();

			if (opIniciojogo == 2) {

				System.out.println("Instruçoes do JOGO DA VIDA!");
				System.out.println("Na vida temosque fazer escolhas em todos os instantes");
				System.out.println("Todas as escolhas tem consequencias");
				System.out.println("Vamos ver como será sua vida baseado nas suas escolhas");
				
			} else if (opIniciojogo == 3) {

				System.out.println("Até a proxima!");
				
			} else {
				
				System.out.println("Bem vindo ao jogo da vida");
				System.out.println(" Vc ababou de completar 7 anos");
				System.out.println(" Sua familia se mudou para uma cidade nova");
				System.out.println(" O que vc faz vai pra 1 - rua explorar ou prefere ficar no  2 - sofá vendo desenhos? ");
				opaos7 = leitor.nextInt();
				
				if (opaos7 == 1) {
					
					System.out.println("Voce brincou muito, pulou de arvores, correu ...");
					System.out.println("Zoou foi zoado ... e como vc se sentiu quando foi zoado?");
					System.out.println(" 1- Até ficou um pouco triste mas não deu muita importancia");
					System.out.println(" 2- Ficou muito triste vc se sentiu muito mal com isso");
					opaos9 = leitor.nextInt();
					
				} else if (opaos7 == 2) {
					
					System.out.println("Você assitiu muitos desenhos, jogou vários jogos de video-game");
					System.out.println("Mas chegava naquela fase do jogo que vc não conseguia passar ... o que vc decidiu fazer ...");
					System.out.println(" 1- Era impossível, vc ficava muito frustrado e mudava de jogo ");
					System.out.println(" 2- Era impossível, ficava frustrado, mas decidido a Salvar naquele jogo foi pesquisar como passar daquela fase");
					opaos9 = leitor.nextInt();
					
				}
				
				System.out.println(opaos7);
				System.out.println(opaos9);
				
			}

				
		}
		leitor.close();
	}

}
