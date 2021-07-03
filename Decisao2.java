package Familia28;

import java.util.Scanner;

//Pedir para o usuário digitar um número de 1 à 12 e mostrar qual o mês que corrersponde esse número.
public class Decisao2 {
	
	public static void main(String[] args) {
		
		int mes;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número do mês desejado (1 à 12)");
		mes = leia.nextInt();
		/*
		if(mes>=1 && mes <=12) // && é operador lógico "e". || é operador lógico "ou"
		{
			
		}
		*/
		
		switch(mes)
		{
		case 1:
			System.out.println("\njaneiro");
			break;
		case 2:
			System.out.println("\nfevereiro");
			break;
		case 3:
			System.out.println("\nmarço");
			break;
		case 4:
			System.out.println("\nabril");
			break;
		case 5:
			System.out.println("\nmaio");
			break;
		case 6:
			System.out.println("\njunho");
			break;
		case 7:
			System.out.println("\njulho");
			break;
		case 8:
			System.out.println("\nagosto");
			break;
		case 9:
			System.out.println("\nsetembro");
			break;
		case 10:
			System.out.println("\noutubro");
			break;
		case 11:
			System.out.println("\nnovembro");
			break;
		case 12:
			System.out.println("\ndezembro");
			break;
			default:
				System.out.println("\nPara de ser Troll!");
		}
	}

}
