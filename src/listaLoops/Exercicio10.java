package listaLoops;

import java.util.Scanner;

public class Exercicio10 {

	// public static final double horaAula = 17.50;
	public static void main(String[] args) {
		int opcao = 0, qtdFuncionarios, finalPlaca;
	
		Scanner leitor = new Scanner(System.in);

		while (opcao != 2) {
			System.out.println("FERRAMENTA DE CONFIRMAÇÃO DE PLACA DE RODIZIO ");
			System.out.println("Selecione a opção desejada:");
			System.out.println("1 - Verificar dia de rodízio");
			System.out.println("2 - sair");

			opcao = leitor.nextInt();

			System.out.println("Por favor digite a quantidade de funcionarios: ");
			qtdFuncionarios = leitor.nextInt();

			for (int i=0; i < qtdFuncionarios; i++) {
				
				String nomeFunc, setor, transporte;
				
				System.out.println("Por favor digite seu nome:");
				nomeFunc = leitor.next();
				System.out.println("Por favor digite seu setor:");
				setor = leitor.next();
				System.out.println("Por favor digite seu meio de transporte:");
				transporte = leitor.next();

				if (transporte.equalsIgnoreCase("carro")) {

					System.out.println("Por favor digite sua placa:");
					finalPlaca = leitor.nextInt();

					switch (finalPlaca) {
					case 1:
					case 2:
						System.out.println(setor + nomeFunc + ", Seu dia de RODIZIO É --> Segunda-feira");
						break;

					case 3:
					case 4:
						System.out.println(nomeFunc + ", Seu dia de RODIZIO É --> Terça-feira");
						break;
					case 5:
					case 6:
						System.out.println(nomeFunc + ", Seu dia de RODIZIO É --> Quarta-feira");
						break;
					case 7:
					case 8:
						System.out.println(nomeFunc + ", Seu dia de RODIZIO É --> Quinta-feira");
						break;
					case 9:
					case 0:
						System.out.println(nomeFunc + ", Seu dia de RODIZIO É --> Sexta-feira");
						break;
					}

				} else {

					System.out.println(nomeFunc + " , Obrigado por participar da pesquisa");

				}

			}
		}

		leitor.close();

	}

}
