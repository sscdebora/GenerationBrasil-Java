package Familia28;

import java.util.Scanner;

public class RepeticaoPara {

	public static void main(String[] args) {
		
		// Entre com 5 valores e mostre o somat�rio dos 5 valores lidos.
		
		float valor,soma=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=5;x++)
		{
			System.out.println("\nEntre com um valor: ");
			valor = leia.nextFloat();
			
			soma = soma + valor;
		}
		System.out.println("\nSomat�rio dos valores: "+soma);
	}

}
