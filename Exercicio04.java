package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4)Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em d�lar.
		O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�vel com o usu�rio,
		para que seja apresentado o valor em moeda brasileira.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor Em Dolar($) Para Converter Para Real(R$): ");
		float dolar = sc.nextFloat();
		System.out.println("Digite O Valor Da Cota��o Do Dolar($) Em Real(R$): ");
		float cotacao = sc.nextFloat();
		float conversao = dolar * cotacao;
		System.out.println("$" + dolar + " = " + "R$" + conversao);
		
		sc.close();
		
		

	}

}
