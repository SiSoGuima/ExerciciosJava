package lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a m�dia.
		//Fa�a um programa onde o professor informe a m�dia e as notas de cada um dos 50 alunos e, ao final,
		//seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.
		
		Scanner leitor = new Scanner(System.in);
		double media, nota;
		int qtdAlunos, qtdAbaixoMedia = 0, qtdAcimaMedia = 0;
		
		System.out.println("Ol� professor! por favor informe a quantidade de Alunos: ");
		qtdAlunos = leitor.nextInt();
		System.out.println("Professor digite a m�dia de nota: " );
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
		System.out.println("Parabens vc aterminou de lan�ar as notas!!!");
		System.out.println("A quantidade de alunos abaixo da m�dia �: " + qtdAbaixoMedia);
		System.out.println("A quantidade de alunos Acima da m�dia �: " + qtdAcimaMedia);
		
		if(qtdAbaixoMedia < qtdAcimaMedia) {
			System.out.println("Parece que vc � um bom professor! Parabens!");
		}else {
			System.out.println("Parece que vc n�o � um bom professor! :-(");
		}
		
		leitor.close();
		
	}

}
