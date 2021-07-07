package Familia28;

import java.util.Scanner;

/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes

Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz. */

public class Lista4Exercicio4 {

	public static void main(String[] args) {
		
		 float[][] a = new float[2][2];
		 float[][] b = new float[2][2];
		 float[][] resultado = new float[2][2];
		 int l,c,valor,op;
		 
		 Scanner leia = new Scanner (System.in);
		 
		 for(l=0;l<2;l++);
		 {
			 for(c=0;c<2;c++)
			 {
				 System.out.println("\nEntre com o valor de A: ");
				 a[l][c] = leia.nextFloat();
				 System.out.println("\nEntre com o valor de B: ");
				 b[l][c] = leia.nextFloat();
				 
			 }
		 }
		 System.out.println("\n\t\tMenu de opções:");
		 System.out.println("\n1-Somar as duas matrizes");
		 System.out.println("\n2-Subtrair a primeira matriz da segunda");
		 System.out.println("\n3-Adicionar uma constante às duas matrizes");
		 System.out.println("\n4-Imprimir as duas matrizes");
		 System.out.println("\nDigite sua opção: ");
		 op = leia.nextInt();
		
		 while(op<1 || op>4)
		 {
			 System.out.println("\nVocê digitou uma opção inválida. Digite novamente.");
			 System.out.println("\n\t\tMenu de opções:");
			 System.out.println("\n1-Somar as duas matrizes");
			 System.out.println("\n2-Subtrair a primeira matriz da segunda");
			 System.out.println("\n3-Adicionar uma constante às duas matrizes");
			 System.out.println("\n4-Imprimir as duas matrizes");
			 System.out.println("\nDigite sua opção: ");
			 op = leia.nextInt();
		 } 
		 switch(op)
		 {
		 case 1:
			 for(l=0;l<2;l++)
			 {
				 for(c=0;c<2;c++)
				 {
					 resultado[1][c] = a[l][c] + b[l][c]; 
					 System.out.println("\nResultado da soma: "+resultado[l][c]);
				 }
			 }
			 break;
		 case 2:
			 for(l=0;l<2;l++)
			 {
				 for(c=0;c<2;c++)
				 {
					 resultado[1][c] = b[l][c] - a[l][c]; 
					 System.out.println("\nResultado da subtração: "+resultado[l][c]);
				 }
			 }
			 break;
		 case 3:
			 System.out.println("\nEntre com um valor da constante: ");
			 valor = leia.nextInt();
			 for(l=0;l<2;l++)
			 {
				 for(c=0;c<2;c++)
				 {
					 a[l][c] =a[l][c] + valor; 
					 System.out.println("\nConstante somada a matriz A: "+a[l][c]);	 
					 b[l][c] =b[l][c] + valor; 
					 System.out.println("\nConstante somada a matriz b: "+b[l][c]);	 
	}

}
			 break;
		 case 4:
			 for(l=0;l<2;l++)
			 {
				 for(c=0;c<2;c++)
				 { 
					 System.out.println("\nMatriz A: "+a[l][c]);	 
					 System.out.println("\nMatriz b: "+b[l][c]);	
				 }
			 }
			 break;
			 default:
				 System.out.println("\nOpção inválida.");
		 }	 
	}
}