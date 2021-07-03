package Familia28;

import java.util.Scanner;

public class Lista2Exercicio2 {
	public static void main(String[] args) {
		
		double a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o prinmeiro número: ");
		a = leia.nextDouble();
		System.out.println("\nEntre com o segundo número: ");
		b = leia.nextDouble();
		System.out.println("\nEntre com o terceiro número: ");
		c = leia.nextDouble();
		
		if(a>b && a>c && b>c)
		{
			System.out.println("\n"+a + "," +b + ","+c);
		}
		else if(b>a && b>c && a>c)
		{
			System.out.println("\n"+b + "," +a + ","+c);
		}
		else if (b>a && b>c && c>a)
		{
			System.out.println("\n"+b + "," +c + ","+a);
		}
		else if (a>b && a>c && c>b)
		{
			System.out.println("\n"+a + "," +c + ","+b);
		}
		else if (c>a && c>b && b>a)
		{
			System.out.println("\n"+c + "," +b + ","+a);
		}
		else
		{
			System.out.println("\n"+c + "," +a + ","+b);
		}
		
	}

}
