package main;

public class PrevisaoClima implements Eventos{
	public PrevisaoClima() {	
	}
	public void update(String message) {
		System.out.println(message + " |> Previs�o do Clima");
	}

}
