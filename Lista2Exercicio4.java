package Familia28;
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. */

import java.util.Scanner;

public class Lista2Exercicio4 {
	
	public static void main(String[] args) {
		
		int a;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
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
