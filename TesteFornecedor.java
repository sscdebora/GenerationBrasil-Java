package Familia28;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fornecedor thiagopedroso = new Fornecedor("Thiago Pedroso","Rua Mauricio Jacquey,321","12345678912",974543322,18,10000,1000);
		Fornecedor leticamaria = new Fonecedor("Letícia Maria","Rua das Hortências,58","12345678912",81124550,19,15000,5);
		
		thiagopedroso.imprimirInfo();
		System.out.println("\n");
		thiagopedroso.validarCPF();
		thiagopedroso.obterSaldo();
		
		System.out.println("\n");
		System.out.println("\n");
		leticiamaria.imprimirInfo();
		System.out.println("\n");
		
	}

}
