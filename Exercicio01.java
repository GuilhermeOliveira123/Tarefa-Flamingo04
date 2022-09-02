package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, 
		baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se forem lidas 
		as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. 
		Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição e 
		seis operações de multiplicação e apresentar doze resultados de saída.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Número: ");
		int A = sc.nextInt();
		System.out.println("Digite O Segundo Número: ");
		int B = sc.nextInt();
		System.out.println("Digite O Terceiro Número: ");
		int C = sc.nextInt();
		System.out.println("Digite O Quarto Número: ");
		int D = sc.nextInt();
		int Soma1 = A + B;
		int Soma2 = C + A;
		int Soma3 = A + D;
		int Soma4 = B + C;
		int Soma5 = B + D;
		int Soma6 = C + D;
		System.out.println("Resultado Da Soma: \nA+B=" + Soma1 + "\nC+A=" + Soma2 + "\nA+D" + Soma3 + "\nB+C" + Soma4
				+ "\nB+C" + Soma5 + "\nB+D" + "\nC+D" + Soma6);
		int Multiplicacao1 = A * B;
		int Multiplicacao2 = C * A;
		int Multiplicacao3 = A * D;
		int Multiplicacao4 = B * C;
		int Multiplicacao5 = B * D;
		int Multiplicacao6 = C * D;
		System.out.println("Resultado Da Multiplicacao: \nA*B=" + Multiplicacao1 + "\nC*A=" + Multiplicacao2 + "\nA*D="
				+ Multiplicacao3 + "\nB*C" + Multiplicacao4 + "\nB*D=" + Multiplicacao5 + "\nC*D=" + Multiplicacao6);
		
		sc.close();


	}

}
