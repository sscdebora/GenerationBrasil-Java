package Familia28;

public class Fornecedor extends Pessoa{//vai herdar da classe Pessoa

	//declaração dos atributos da classe Fornecedor
	private double valorCredito;
	private double valorDivida;
	
	//declaração do método especial Construtor
	public Fornecedor(String nome,String endereco,String cpf,int telefone,int idade,double valorCredito,double valorDivida)
	{
		super(nome,endereco,cpf,telefone,idade);//passar os parâmetros para a super classe
		this.valorCredito = valorCredito;//inicializando os atributos da classe Fornecedor
		this.valorDivida = valorDivida;
	}
	
	//criar os metodos getters and setter
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//criação dos métodos escíficos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do fornecedor: "+getNome()+"\n+"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\nValor monetario total dos artigos produzidos por "+getNome()+"\nPorcentagem (sem o %) da cimissao desse artigo: "+comissao);
	}
	
}
