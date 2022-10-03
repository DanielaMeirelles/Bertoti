package main;

public class App {

	public static void main(String[] args) {
		Methereologics clima = new Methereologics();
		
		clima.event.subscribe(new OuvinteTempo());
		clima.event.subscribe(new OuvinteTempo());
		clima.event.subscribe(new OuvinteTemperatura());
		
		clima.tempChange("18ºC");
		clima.weatherChange("Nublado");
		clima.tempChange("21ºC");

	}

}
