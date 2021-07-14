package Familia28;

public class Operario extends Pessoa {//minha classe Operario vai herdar todas as caracteristicas da classe Pessoa
	
	//declara��o dos atributos da classe Operario
	private double valorProducao;
	private double comissao;
	
	//criar o construtor da classe Operario
	public Operario(String nome,String endereco,String cpf,int telefone,int idade,double valorProducao,double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);//passar os par�metros para a super classe
		this.valorProducao = valorProducao;//inicializando os atributos da classe Operario
		this.comissao = comissao;
	}
	
	//declara��o dos m�todos getters and setters
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}	 
	
	//criar os m�todos especificos da classe Operario
	public void imprimirInfo()
	{
		System.out.println("\nNome do operario: "+getNome()+"\n+"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endere�o: "+getEndereco()+"\nValor monetario total dos artigos produzidos por "+getNome()+"\nPorcentagem (sem o %) da cimissao desse artigo: "+comissao);
	}
	public void calcularSalario()
	{
		double valorTotal = valorProducao - (valorProducao * (comissao/100));
		System.out.println("\nO sal�rio total a ser recebido pelo operario "+getNome()+" � igual a: "+valorTotal);
	}
	
	public void validarCPF()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("\n--CPF inv�lido.--");
		}
		else
		{
			System.out.println("\n--CPF v�lido.--");
		}
	}
}