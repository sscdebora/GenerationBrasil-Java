//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
package Familia28;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double idadeemanos,idadeemmeses,idadeemdias,expressaemdias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade em anos: ");
		idadeemanos = leia.nextDouble();
		System.out.println("\nEntre com sua idade em meses: ");
		idadeemmeses = leia.nextDouble();
		System.out.println("\nEntre com sua idade em dias: ");
		idadeemdias = leia.nextDouble();
		
		expressaemdias = (idadeemanos*12*365);
		
		System.out.println("\nA idade em dias é: "+expressaemdias);

	}

}
