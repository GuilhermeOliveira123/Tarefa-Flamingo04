package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9) Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador e tamb�m o valor do percentual 
		de reajuste (vari�vel PR) a ser atribu�do. Apresentar o valor do novo sal�rio (vari�vel NS).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Sal�rio Mensal (R$): ");
		float salario_Mensal=sc.nextFloat();
		System.out.println("Percentual De Reajuste(EM%): ");
		float percentural_De_Reajuste=sc.nextFloat();
		float novo_Sal�rio=salario_Mensal+(percentural_De_Reajuste/100)*salario_Mensal;
		System.out.println("Novo Valor DO Sal�rio �: "+novo_Sal�rio+"R$");
		
		sc.close();

	}

}
