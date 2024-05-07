package ar.com.templateit.principal;

public class Principal {
	
	
	public static void main(String[] args) {
		
		EstudianteUnivesitario estudianteUniversitario = new EstudianteUnivesitario();
		
		estudianteUniversitario.setNombre("Juan"); //heredó el atributo de la clase padre Persona
		estudianteUniversitario.caminar();         //heredó el método de la clase padre Persona
		estudianteUniversitario.becar();           //metodo default por herencia múltiple de la interface BecableContratable
		estudianteUniversitario.contratar();       //metodo default por herencia múltiple de la interface BecableContratable
		
		EstudianteMaestria estudianteMaestria = new EstudianteMaestria();
		estudianteMaestria.setNombre("Lionel");    //heredó el atributo de la clase padre Persona
		estudianteMaestria.caminar();              //heredó el método de la clase padre Persona
		estudianteMaestria.becar();                //sobre escribió por implementacion de interface Becable
		estudianteMaestria.contratar();            //sobre escribió por implementacion de interface Contratable
		
		Ingeniero ingeniero = new Ingeniero();
		ingeniero.setNombre("Pedro");              //heredó el atributo de la clase padre Persona
		ingeniero.caminar();                       //heredó el método de la clase padre Persona
		ingeniero.contratar();                     //sobre escribió por implementacion de interface Contratable
		
	}

}
