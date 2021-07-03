package Familia28;

import java.util.Scanner;

public class Lista2Exercicio1 {
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o prinmeiro número: ");
		a = leia.nextInt();
		
		System.out.println("\nEntre com o segundo número: ");
		b = leia.nextInt();
		
		System.out.println("\nEntre com o terceiro número: ");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("\no número "+a + " é maior que "+b + " e "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println("\no número "+b + " é maior que "+a + " e "+c);
		}
		else
		{
			System.out.println("\no número "+c + " é maior que "+a + " e "+b);
		}
		
	}

}
