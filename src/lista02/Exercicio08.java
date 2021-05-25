package lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média.
		//Faça um programa onde o professor informe a média e as notas de cada um dos 50 alunos e, ao final,
		//seja exibido quantos alunos tiveram nota superior à média e quantos tiveram nota inferior à média.
		
		Scanner leitor = new Scanner(System.in);
		double media, nota;
		int qtdAlunos, qtdAbaixoMedia = 0, qtdAcimaMedia = 0;
		
		System.out.println("Olá professor! por favor informe a quantidade de Alunos: ");
		qtdAlunos = leitor.nextInt();
		System.out.println("Professor digite a média de nota: " );
		media = leitor.nextInt();
		
		while ((qtdAbaixoMedia + qtdAcimaMedia) < qtdAlunos) {
			System.out.println("Digite a nota do aluno " + (qtdAbaixoMedia + qtdAcimaMedia + 1));

			nota = leitor.nextDouble();
			
			if (nota < media ) {
				qtdAbaixoMedia++;
			}else {
				qtdAcimaMedia++;
			}
			
		}
		System.out.println("Parabens vc aterminou de lançar as notas!!!");
		System.out.println("A quantidade de alunos abaixo da média é: " + qtdAbaixoMedia);
		System.out.println("A quantidade de alunos Acima da média é: " + qtdAcimaMedia);
		
		if(qtdAbaixoMedia < qtdAcimaMedia) {
			System.out.println("Parece que vc é um bom professor! Parabens!");
		}else {
			System.out.println("Parece que vc não é um bom professor! :-(");
		}
		
		leitor.close();
		
	}

}
