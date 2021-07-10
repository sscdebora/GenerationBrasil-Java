package Familia28;

public class Testeautomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um objeto da classe automovel
		
		Automovel auto1 =  new Automovel("Felipe Pereira","Lamborghini","FLP02042000",2021);
		
		//troca de mensagens (chamada ao método imprimirInfo()
		auto1.imprimirInfo();
		System.out.println("***********************Transferência de Proprietário*************************");
		auto1.setNomeProprietario("Thiago Pedroso");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Barbara Amaral","Ferrari 458", "Bab2003", 2020);
		auto2.imprimirInfo();
		auto2.setPlaca("BA0A567");
		auto2.imprimirInfo();
		
	}

}
