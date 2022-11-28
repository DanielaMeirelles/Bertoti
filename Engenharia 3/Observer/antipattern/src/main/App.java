package main;

public class App {

	public static void main(String[] args) {
		Metereologia weather = new Metereologia();
		
		weather.event.subscribe(new Eventos());
		weather.event.subscribe(new Eventos());
		weather.event.subscribe(new Eventos());
		
		weather.tempChange("32°C");
		weather.weatherChange("Tempestade Forte");
		weather.tempChange("20°C");
	}

}
