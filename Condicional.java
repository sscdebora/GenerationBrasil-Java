package Familia28;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.printf("\nEntre com o seu nome: ");
		nome = leia.nextLine();
		System.out.printf("\nSeu nome é %s",nome);
		System.out.printf("\nSua idade é %d",idade);
		
		if(idade>=18)
		{
			System.out.printf("\nVoce é maior de idade.");
		}
		else if(idade>=1 && idade<18)
		{
			System.out.printf("\nVoce é menor de idade.");
		}
		else
		{
			System.out.printf("\nVocê entrou com uma idade inválida.");
		}
	}

}
