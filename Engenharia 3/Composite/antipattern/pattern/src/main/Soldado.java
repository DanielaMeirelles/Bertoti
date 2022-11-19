package main;

public class Soldado implements Militar {
	private String nome;
	private String patente;
	
	public Soldado(String nome, String patente) {
		this.nome = nome;
		this.patente = patente;
	}
	
	public void executarOrdem(String ordem) {
		System.out.println(String.format("Ordem \"{0}\" executada por {1}/{2}.", ordem, nome, patente));
	}

}
