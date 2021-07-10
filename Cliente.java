package Familia28;

public class Cliente {
	//declaração dos atributos da classe Cliente.
	private String nomeCompleto;
	private String nacionalidade;
	private int nascimento;
	
	//metodo contrutor
	public Cliente (String nomeCompleto,String nacionalidade,int nascimento)
	{
		this.nomeCompleto = nomeCompleto;
		this.nacionalidade = nacionalidade;
		this.nascimento = nascimento;
	}
	
	public Cliente(String nacionalidade)
	{
		this.nacionalidade = nacionalidade;
	}
	
	//declaraçãp dos demais metodos da classe Cliente
	public void imprimirInfo() 
	{
		System.out.println(nomeCompleto+" é native de "+nacionalidade+" e nasceu em "+nascimento);
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
