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
		System.out.printf("\nSeu nome � %s",nome);
		System.out.printf("\nSua idade � %d",idade);
		
		if(idade>=18)
		{
			System.out.printf("\nVoce � maior de idade.");
		}
		else if(idade>=1 && idade<18)
		{
			System.out.printf("\nVoce � menor de idade.");
		}
		else
		{
			System.out.printf("\nVoc� entrou com uma idade inv�lida.");
		}
	}

}
