package Familia28;

import java.util.Scanner;

public class Lista2Exercicio1 {
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o prinmeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("\nEntre com o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("\nEntre com o terceiro n�mero: ");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("\no n�mero "+a + " � maior que "+b + " e "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println("\no n�mero "+b + " � maior que "+a + " e "+c);
		}
		else
		{
			System.out.println("\no n�mero "+c + " � maior que "+a + " e "+b);
		}
		
	}

}
