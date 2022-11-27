package main;

public class App {

	public static void main(String[] args) {
		CaixaEletronico conta = new CaixaEletronico();
		int atualizar = 0;
		
		atualizar = conta.sacar(1000, 500);
		System.out.println("Saldo na conta: ");
		System.out.println(atualizar);
		
		atualizar = conta.depositar(1500, 250);
		System.out.println("Saldo na conta: ");
		System.out.println(atualizar);
		
		atualizar = conta.sacar(1250, 4);
		System.out.println("Saldo na conta: ");
		System.out.println(atualizar);

	}
}
