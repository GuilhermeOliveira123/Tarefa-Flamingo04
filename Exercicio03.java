package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3) Ler dois inteiros (vari�veis A e B) e imprimir o resultado do quadrado da diferen�a do primeiro valor pelo segundo.*/
		
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor Da Vari�vel A: ");
		int valorA = sc.nextInt();
		System.out.println("Digite O Valor DA Vari�vel B: ");
		int valorB = sc.nextInt();
		resultado = valorA - valorB;
		resultado = resultado * resultado;
		System.out.println("Resultado Do Quadrado Ser�: "+resultado);
		
		sc.close();

	}

}
