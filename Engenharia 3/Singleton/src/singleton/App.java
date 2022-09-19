package singleton;

public class App {
		public static void main(String[] args) {
			Singleton first = Singleton.getInstance("Bem Vindo!");
			first.show();
			
			Singleton second = Singleton.getInstance("Volte sempre!");
			second.show();
		}
}
