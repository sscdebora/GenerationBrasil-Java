package Familia28;

import java.util.Scanner;

//Pedir para o usu�rio digitar um n�mero de 1 � 12 e mostrar qual o m�s que corrersponde esse n�mero.
public class Decisao2 {
	
	public static void main(String[] args) {
		
		int mes;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o n�mero do m�s desejado (1 � 12)");
		mes = leia.nextInt();
		/*
		if(mes>=1 && mes <=12) // && � operador l�gico "e". || � operador l�gico "ou"
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
			System.out.println("\nmar�o");
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
