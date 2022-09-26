package main;

public class App {

	public static void main(String[] args) {
		Animal cavalo = new Animal(new Herbivoro());
		Animal tigre = new Animal(new Carnivoro());
		Animal macaco = new Animal(new Onivoro());
		
		cavalo.alimentar();
		tigre.alimentar();
		macaco.alimentar();

	}

}
