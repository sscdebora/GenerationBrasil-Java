package Familia28;

import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que leia as médias dos alunes e calcule a média geral.
		
		final int tamanho=4;
		
		float [] media = new float[tamanho];
		//String [] nome = new String[5];
		float somamedia=0,mediageral;
		int x;
		
				
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++)
		{
			
			System.out.println("\nEntre com a sua média: ");
			media[x] = leia.nextFloat();
			
			somamedia = somamedia + media[x];
		}
		mediageral = somamedia / 4;
		System.out.printf("\nMédia geral: %2.2f",mediageral);
	}
}

