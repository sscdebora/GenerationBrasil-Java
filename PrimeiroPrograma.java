package Familia28;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: "); //8
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: "); //8
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: "); //8
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMédia: "+media);
		System.out.printf("\nMédia: %2.2f",media);
		
		nota1= Math.sqrt(nota2); //sqrt é a raiz quadrada
		nota2= Math.pow(nota3,3); //é potencia, entao tem que colocar a base e o expoente
		nota3= nota1 % 2;
	}

}
