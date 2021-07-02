package Familia28;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double idadeemdias,expressaemanos,expressaemdias = 0,expressaemmeses,anos,meses,dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade em dias");
		idadeemdias = leia.nextDouble();
		System.out.println("\nEntre com sua idade em anos");
		expressaemanos = leia.nextDouble();
		System.out.println("\nEntre com sua idade em meses");
		expressaemmeses = leia.nextDouble();
		
		anos = (idadeemdias/365);
		meses = (idadeemdias/30);
		dias = (expressaemanos*365);
		
		System.out.println("\nA idade em anos é: "+anos + " anos " +meses + " meses e " +dias + " dias. ");
		
				
		
				
		

	}

}
