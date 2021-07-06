package Familia28;

import java.util.Scanner;

public class RepeticaoFacaEnquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabuada,res,x=1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o valor da tabuada: ");
		tabuada = leia.nextInt();
		do
		{
			res = tabuada * x;
			System.out.println("\n"+tabuada+" x "+x+" = "+res);
			x++;
		}
		while(x<=10);
	}

}
