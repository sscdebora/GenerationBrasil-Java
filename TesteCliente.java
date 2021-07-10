package Familia28;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		//instanciando um objeto da classe Cliente
		
		Cliente cli1 = new Cliente("Débora Cristina","Brasil",1999);
		
		//troca de mensagens (chamada ao método imprimirInfo()

	cli1.imprimirInfo();
	System.out.println("*********Troca de Nome**********");
	cli1.setNomeCompleto("Débora Cristina Souza Santos");
	cli1.imprimirInfo();
	
	Cliente cli2 = new Cliente("Thomas Eduard","Brasil",2010);
	cli2.imprimirInfo();
	cli2.setNomeCompleto("Thomas Eduard Santos");
	cli2.imprimirInfo();
	
 }

}
