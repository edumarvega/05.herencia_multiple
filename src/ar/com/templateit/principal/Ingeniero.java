package ar.com.templateit.principal;

public class Ingeniero extends Persona implements Contratable{

	@Override
	public void contratar() {
		System.out.println("Ingeniero contratado...");
		
	}

}
