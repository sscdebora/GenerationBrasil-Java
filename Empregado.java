package Familia28;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private double salario;
	
	public Empregado(String n,double s) //construtor
	{
		this.setNome(n); // inicializa��o do atributo nome
		this.setSalario(s); // inicializa��o do atributo salario
	}
	//defini��o dos m�todos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) //10 (est� na classe TesteEmoregado)
	{
		salario *= 1 + percentual/100; // salario = salario *(1+percentual/100) j� � uma forma, esse numero "1" pertence � formula, para se referir ao salario original antes do percentual
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //pega a moeda do pa�s que est� configurado o SO
		nf.setMinimumFractionDigits(2); //formata a quantidade de casas depois da v�rgula
		String formatoMoeda = nf.format(salario); //formata a sa�da do meu valor monet�rio
		return formatoMoeda;// vou retornar o sal�rio j� formatado
	}
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+"Sal�rio: "+this.formatarMoeda());
	}

}