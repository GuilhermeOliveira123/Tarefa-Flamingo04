package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10) Em uma elei��o sindical concorreram ao cargo de presidente tr�s candidatos (A, B e C). 
		Durante a apura��o dos votos foram computados votos nulos e votos em branco, al�m dos votos v�lidos para 
		cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de votos v�lidos para 
		cada candidato, al�m de efetuar tamb�m a leitura da quantidade de votos nulos e votos em branco. Ao final o programa 
		deve apresentar o n�mero total de eleitores, considerando votos v�lidos, nulos e em branco; o percentual 
		correspondente de votos v�lidos em rela��o � quantidade de eleitores; o percentual correspondente de votos v�lidos 
		do candidato A em rela��o � quantidade de eleitores; o percentual correspondente de votos v�lidos do candidato B 
		em rela��o � quantidade de eleitores; o percentual correspondente de votos v�lidos do candidato C em rela��o � 
		quantidade de eleitores; o percentual correspondente de votos nulos em rela��o � quantidade de eleitores; e 
		por �ltimo o percentual correspondente de votos em branco em rela��o � quantidade de eleitores.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Votos Validos Para Candidato A");
		float candidatoA = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Validos Para Candidato B");
		float candidatoB = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Validos Para Candidato C");
		float candidatoC = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Nulos");
		float votoNulo = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Brancos");
		float votoBranco = sc.nextFloat();
		float votoValido = candidatoA + candidatoB + candidatoC;
		float totalEleitor = votoValido + votoNulo + votoBranco;
		float percentualValido = (votoValido * 100) / totalEleitor;
		float percentualValidoA = (candidatoA * 100) / totalEleitor;
		float percentualValidoB = (candidatoB * 100) / totalEleitor;
		float percentualValidoC = (candidatoC * 100) / totalEleitor;
		float percentualNulo = (votoNulo * 100) / totalEleitor;
		float percentualBranco = (votoBranco * 100) / totalEleitor;
		System.out.println("O total de voto v�lido �: " + votoValido);
		System.out.println("O total de eletitores s�o: " + totalEleitor);
		System.out.println("o percentual de votos v�lidos para o candidato A � de " + percentualValido + "%");
		System.out.println("o percentual de votos v�lidos para o candidato A � de " + percentualValidoA + "%");
		System.out.println("o percentual de votos v�lidos para o candidato B � de " + percentualValidoB + "%");
		System.out.println("o percentual de votos v�lidos para o candidato C � de " + percentualValidoC + "%");
		System.out.println("o percentual de votos Nulos � de " + percentualNulo + "%");
		System.out.println("o percentual de votos Brancos � de " + percentualBranco + "%");
		
		sc.close();

	}

}
