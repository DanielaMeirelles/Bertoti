package main;

import java.util.ArrayList;
import java.util.List;

public class Militar {
	private List<Marinheiro> marinha = new ArrayList<Marinheiro>();
	private List<Soldado> soldado = new ArrayList<Soldado>();
	
	public void buy() {
		for(Marinheiro can: marinha)
		{
			can.buy();
		}
		for(Soldado cad: soldado)
		{
			cad.buy();
		}
		System.out.println("Executar ordem...");
		marinha.clear();
		soldado.clear();
	}
	
	public void addMarinheiro(Marinheiro m){
		this.marinha.add(m);
	}
	
	public void addSoldado(Soldado s){
		this.soldado.add(s);
	}
	
	public void removeMarinheiro(Marinheiro m){
		marinha.remove(m);
	}
	
	public void removeSoldado(Soldado s){
		soldado.remove(s);
	}

}
