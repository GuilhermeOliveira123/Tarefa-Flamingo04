package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6) Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado final 
		� soma dos quadrados dos tr�s valores lidos.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Valor A: ");
		float valorA = sc.nextFloat();
		System.out.println("Digite O Valor B: ");
		float valorB = sc.nextFloat();
		System.out.println("Digite O Valor C: ");
		float valorC = sc.nextFloat();
		float soma = (valorA*valorA)+(valorB*valorB)+(valorC*valorC);
		System.out.println("A Soma Dos Quadrados �: " +soma);
		
		sc.close();
		
		

	}

}
