package Familia28;

import java.util.Scanner;

public class Lista2Execicio3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a idade entre 10 à 25 anos e saiba em qual categoria você se encaixa.");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nA sua idade de: "+idade + " anos, se enquadra na categoria Infantil.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nA sua idade de: "+idade + " anos, se enquadra na categoria Juvenil.");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("\nA sua idade de: "+idade + " anos, se enquadra na categoria Adulte.");
		}
		else 
		{
			System.out.println("Não temos categorias para menor de 10 ou maior que 25.");
		}

	}

}
