package Familia28;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		double tempoemsegundos,horas,minutos,segundos,hms;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nEntre com o tempo em segundos: ");
		tempoemsegundos = leia.nextDouble();
		
		horas = (tempoemsegundos/60)/60;
		minutos = (horas*60);
		segundos = (horas*60)*60;
		
		System.out.println("\nO tempo de dração foi: " +horas +" horas " +minutos + " minutos e " +segundos + " segundos ");
	
	
	
	
	
	
	
	}
	
}
