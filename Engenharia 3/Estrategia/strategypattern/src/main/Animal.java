package main;

public class Animal {
private Alimentacao alimentacao;
	
	public Animal(Alimentacao alimentacao) {
		setTipoAlimentacao(alimentacao);
	}
	
	public void setTipoAlimentacao(Alimentacao alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	public void alimentar() {
		this.alimentacao.comer();
	}

}
