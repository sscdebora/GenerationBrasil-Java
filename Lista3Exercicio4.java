package Familia28;

import java.util.Scanner;

/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, identidade de genero (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos. */

public class Lista3Exercicio4 {

	public static void main(String[] args) {
		
		int idade,identgenero,fatorpsico,x=1;
		int contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nEntre com a sua identidade de genero -- 1-Feminino  2-Masculino  3-Outros ");
			identgenero = leia.nextInt();
			System.out.println("\nEntre com o fator psicológico -- 1-Calma  2-Nervosa  3-Agressiva");
			fatorpsico = leia.nextInt();
			
			if(fatorpsico == 1)
			{
				contpc++;
			}
			if(identgenero==1 && fatorpsico==2)
			{
				contmn++;
			}
			if(identgenero==2 && fatorpsico==3)
			{
				contha++;
			}
			if(identgenero==3 && fatorpsico==1)
			{
				contoc++;	
			}
			if(fatorpsico==2 && idade>40)
			{
				contpn40++;
			}
			if(fatorpsico==1 && idade<18)
			{
				contpc18++;
			}
			
			x++;
		}
		
		System.out.println("\nPessoas calmas: "+contpc);
		System.out.println("\nMulheres nervosas: "+contmn);
		System.out.println("\nHomens agressivos: "+contha);
		System.out.println("\nOutros calmas: "+contoc);
		System.out.println("\nPessoas nervosas acima de 40 anos: "+contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contpc18);
		
	}

}

