package main;

import java.util.ArrayList;
import java.util.List;

public class EventoClimatico {
	
	private List<Eventos> listeners = new ArrayList<Eventos>();
	
	public void subscribe(Eventos listener) {
		listeners.add(listener);
	}
	
	public void unsubscribe(Eventos listener) {
		listeners.remove(listener);
	}
	
	public void notify(Eventos typeListener, String message) {
		for (Eventos listener : listeners) {
			if(listener.getClass().equals(typeListener.getClass()))
				listener.update(message);
		}

}
}
