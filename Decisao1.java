package Familia28;

import java.util.Scanner;
//Entre com o numero e informe se este numero � positivo maior que zero, negativo ou zero.
public class Decisao1 {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		num = leia.nextInt();
		
		if(num>0)
		{
			System.out.println("\n"+num+" :� positivo e maior que zero.");
		}
		else if(num<0)
		{
			System.out.println("\n"+num+" :� negativo.");
		}
		else
		{
			System.out.println("\n"+num+" :Zero � positivo.");
		}
	}
}
