package main;

public class Metereologia {
	public EventoClimatico event;
	
	public Metereologia() {
		event = new EventoClimatico();
	}
	
	public void weatherChange(String message) {
		event.notify(new PrevisaoClima(), message);
	}
	
	public void tempChange(String message) {
		event.notify(new PrevisaoTemperatura(), message);
	}

}
