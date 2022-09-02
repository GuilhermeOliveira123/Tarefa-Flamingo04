package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.*/
		
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor Da Variável A: ");
		int valorA = sc.nextInt();
		System.out.println("Digite O Valor DA Variável B: ");
		int valorB = sc.nextInt();
		resultado = valorA - valorB;
		resultado = resultado * resultado;
		System.out.println("Resultado Do Quadrado Será: "+resultado);
		
		sc.close();

	}

}
