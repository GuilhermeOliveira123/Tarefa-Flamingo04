package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5) Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em real. 
		O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel com o usu�rio, 
		para que seja apresentado o valor em moeda americana.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor Em Real(R$) Para Converter Para Dolar($): ");
		float real = sc.nextFloat();
		System.out.println("Digite O Valor Da Cota��o Do Real($) Em Dolar(R$): ");
		float cotacao = sc.nextFloat();
		float conversao = real * cotacao;
		System.out.println("R$" + real + " = " + "$" + conversao);
		
		sc.close();

	}

}
