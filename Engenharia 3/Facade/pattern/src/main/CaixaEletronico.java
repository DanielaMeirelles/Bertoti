package main;

public class CaixaEletronico {
	
	public int sacar(int atual, int atualizado) {
		return atual - atualizado;
	}
	
	public int depositar(int atual, int atualizado) {
		return atual + atualizado;
	}

}
