package ar.com.templateit.principal;

public class EstudianteMaestria extends Persona implements Becable, Contratable{

	@Override
	public void contratar() {
		System.out.println("Estudiante de maestría contratado...");
		
	}

	@Override
	public void becar() {
		System.out.println("Estudiante de maestría becado...");
		
	}

}
