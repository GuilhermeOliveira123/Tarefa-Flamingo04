package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (vari�veis A, B, C e D). Ao final o programa deve apresentar 
		o resultado do produto (vari�vel P) do primeiro com o terceiro valor, e o resultado do produto (vari�vel P) do primeiro com o terceiro valor, 
		e o resultado da soma (vari�vel S) do segundo com o quarto valor.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Valor A:");
		float valorA = sc.nextFloat();
		System.out.println("Digite O Valor B:");
		float valorB = sc.nextFloat();
		System.out.println("Digite O Valor C:");
		float valorC = sc.nextFloat();
		System.out.println("Digite O Valor D:");
		float valorD = sc.nextFloat();
		float produto = valorA*valorC;
		float soma = valorB+valorD;
		System.out.println("Valor Da Vari�vel P = "+produto+ "\nValor Da Vari�vel S = "+soma);
		
		sc.close();

	}

}
