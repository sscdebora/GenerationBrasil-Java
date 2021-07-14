package Familia28;

public class Pessoa { //superclasse tambem conhecida como classe mãe
	//declaramos os atributos da classe Pessoa
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone; // pode ser string ou int
	private int idade;
	//quando declaro como private estou indicando que o meu atributo sóserá acessado pelos metodos da minha propria classe
	
	//estou montano o meu construtor que serve para inicializar os meus atributos
	public Pessoa(String nome, String endereco,String cpf,int telefone,int idade)
	{
		super(); //para indicar que os atributos são da super classe
		this.nome = nome; //inicialização dos meus atributos, vou passar o parâmetro para o atributo
		this.endereco = endereco; //vou usar o this para diferenciar o meu atributo do meu parâmetro
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
		
	// a partir daqui vou começar a criar meus métodos getters e setters
	
	public String getNome() {
		return nome;
	}

	

	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}


	// agora estamos criando os métodos específicos da classe Pessoa
	public void validarCPF()
	{
		if(getCpf().length()!=11) //length conta a quatidade de caracteres
		{
			System.out.println("\n--CPF inválido.--");
		}
		else
		{
			System.out.println("\n--CPF válido.--");
		}
	}
}
