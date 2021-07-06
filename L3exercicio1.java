package Familia28;

public class L3exercicio1 {

	public static void main(String[] args) {

		int x;
		boolean calculo;
		
		for(x=1000;x<1999;x++);
		{
			System.out.printf("\n %d",x);
			
			calculo = (x % 11 == 5); 
			x++;
		}
		System.out.printf(x+"é um numero que dividido por 11 que resta 5.");

	}

}
