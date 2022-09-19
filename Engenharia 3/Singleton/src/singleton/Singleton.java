package singleton;

public class Singleton {
	private static Singleton singleton;
	private String message;
	
	private Singleton(String message) {
		this.message = message;
	}
	
	public static Singleton getInstance(String message) {
		if(singleton == null)
			singleton = new Singleton(message);
		
		return singleton;
	}
	
	public void show() {
		System.out.println(message);
	}
}

