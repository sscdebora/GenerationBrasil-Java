package Familia28;
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */

import java.util.Scanner;

public class Lista2Exercicio4 {
	
	public static void main(String[] args) {
		
		int a;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		a = leia.nextInt();
		
		if(+a %2==0) 
		{
			resultado = Math.sqrt(a);
		}
		else
		{
			resultado = Math.pow(a,2);
		}
		
		System.out.println("\nResultado: "+resultado);
		
	}
}
