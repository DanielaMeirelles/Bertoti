package main;

public class Methereologics {
public GerenciarEventos event;
	
	public Methereologics() {
		event = new GerenciarEventos();
	}
	
	public void weatherChange(String message) {
		event.notify(new OuvinteTempo(), message);
	}
	
	public void tempChange(String message) {
		event.notify(new OuvinteTemperatura (), message);

}
}