package exercicio04terefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual 
		de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Salário Mensal (R$): ");
		float salario_Mensal=sc.nextFloat();
		System.out.println("Percentual De Reajuste(EM%): ");
		float percentural_De_Reajuste=sc.nextFloat();
		float novo_Salário=salario_Mensal+(percentural_De_Reajuste/100)*salario_Mensal;
		System.out.println("Novo Valor DO Salário É: "+novo_Salário+"R$");
		
		sc.close();

	}

}
