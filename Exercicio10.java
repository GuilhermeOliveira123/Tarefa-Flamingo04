package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). 
		Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para 
		cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos para 
		cada candidato, além de efetuar também a leitura da quantidade de votos nulos e votos em branco. Ao final o programa 
		deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco; o percentual 
		correspondente de votos válidos em relação à quantidade de eleitores; o percentual correspondente de votos válidos 
		do candidato A em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato B 
		em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato C em relação à 
		quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e 
		por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.*/
		
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
		System.out.println("O total de voto válido é: " + votoValido);
		System.out.println("O total de eletitores são: " + totalEleitor);
		System.out.println("o percentual de votos válidos para o candidato A é de " + percentualValido + "%");
		System.out.println("o percentual de votos válidos para o candidato A é de " + percentualValidoA + "%");
		System.out.println("o percentual de votos válidos para o candidato B é de " + percentualValidoB + "%");
		System.out.println("o percentual de votos válidos para o candidato C é de " + percentualValidoC + "%");
		System.out.println("o percentual de votos Nulos é de " + percentualNulo + "%");
		System.out.println("o percentual de votos Brancos é de " + percentualBranco + "%");
		
		sc.close();

	}

}
