package Familia28;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado [] lista = new Empregado[4];
		
		lista[0] = new Empregado("Rafael",5000);
		lista[1] = new Empregado("Jooh",7000);
		lista[2] = new Empregado("Jakers",6000);
		lista[3] = new Empregado("Samuel Santos",20000);
		
		for(Empregado roda:lista)
		{
			roda.imprimir();
		}
		
		System.out.println("**********************************************");
		for(Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}
