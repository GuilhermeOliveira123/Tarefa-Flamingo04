package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*7) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final 
		o quadrado da soma dos três valores lidos.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Valor A: ");
		float valorA = sc.nextFloat();
		System.out.println("Digite o Valor B: ");
		float valorB = sc.nextFloat();
		System.out.println("Digite O Valor C: ");
		float valorC = sc.nextFloat();
		float Soma_Do_Quadrado = (valorA + valorB + valorC) * (valorA + valorB + valorC);
		System.out.println("Resultado Da Soma É: " + Soma_Do_Quadrado);
		
		sc.close();

	}

}
