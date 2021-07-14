package Familia28;

public class Empregado1 extends Pessoa { //estou criando uma heranã da classe Pessoa. Isso quer dizer que o Empregado1 pode herdar todas as criações da classe Pessoa
	
	//declarar os atributos da classe Empregado1
	private int codigoSetor;
	private float salarioBase;
	private float imposto; //esses atributos são somente da classe Empregado1,ou seja, nao estão na super classe
	
	//criaçãp do meu Construtor
	public Empregado1(String nome,String endereco,String cpf,int telefone,int idade,int codigoSetor,float salarioBase,float imposto)
	{
		super(nome,endereco,cpf,telefone,idade); //quando eu uso a palavra reservada "super", estou indicando que iri carregar os parametro na minha super classe Pessoa
		this.codigoSetor = codigoSetor;//inicializando os atributos da minha própria classe e por este motivo eu usp o this
		this.salarioBase = salarioBase;
		this.imposto = imposto; 
	}
	
	//criação dos get e set
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	//começo a criar os metodos especificos da minha classe
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\n+"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\n"+"Código do setor: "+codigoSetor+"\nSalário base: "+salarioBase+"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "+imposto);
	}
	
	public void calcularSalario()
	{
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado "+getNome()+" é igual a: "+salarioTotal);
	}
	
}