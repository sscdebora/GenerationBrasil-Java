package Familia28;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private double salario;
	
	public Empregado(String n,double s) //construtor
	{
		this.setNome(n); // inicialização do atributo nome
		this.setSalario(s); // inicialização do atributo salario
	}
	//definição dos métodos
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
	
	public void aumentarSalario(double percentual) //10 (está na classe TesteEmoregado)
	{
		salario *= 1 + percentual/100; // salario = salario *(1+percentual/100) já é uma forma, esse numero "1" pertence à formula, para se referir ao salario original antes do percentual
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //pega a moeda do país que está configurado o SO
		nf.setMinimumFractionDigits(2); //formata a quantidade de casas depois da vírgula
		String formatoMoeda = nf.format(salario); //formata a saída do meu valor monetário
		return formatoMoeda;// vou retornar o salário já formatado
	}
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+"Salário: "+this.formatarMoeda());
	}

}