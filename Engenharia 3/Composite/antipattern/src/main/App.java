package main;

public class App {

	public static void main(String[] args) {
		Marinheiro marinha1 = new Marinheiro();
		Marinheiro marinha2 = new Marinheiro();
		Soldado soldado = new Soldado();
		
		Militar militar = new Militar();
		militar.addMarinheiro(marinha1);
		militar.addMarinheiro(marinha2);
		militar.addSoldado(soldado);
		
		militar.buy();
		
		militar.addMarinheiro(marinha1);
		militar.addSoldado(soldado);
		
		militar.buy();

	}

}
