package main;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEventos {
	private List<ListaEventos> listeners = new ArrayList<ListaEventos>();
	
	public void subscribe(ListaEventos listener) {
		listeners.add(listener);
	}
	
	public void unsubscribe(ListaEventos listener) {
		listeners.remove(listener);
	}
	
	public void notify(ListaEventos typeListener, String message) {
		for (ListaEventos listener : listeners) {
			if(listener.getClass().equals(typeListener.getClass()))
				listener.update(message);
		}
	}
}
