package ar.com.templateit.principal;

public class Principal {
	
	
	public static void main(String[] args) {
		
		EstudianteUnivesitario estudianteUniversitario = new EstudianteUnivesitario();
		
		estudianteUniversitario.setNombre("Juan"); //hered� el atributo de la clase padre Persona
		estudianteUniversitario.caminar();         //hered� el m�todo de la clase padre Persona
		estudianteUniversitario.becar();           //metodo default por herencia m�ltiple de la interface BecableContratable
		estudianteUniversitario.contratar();       //metodo default por herencia m�ltiple de la interface BecableContratable
		
		EstudianteMaestria estudianteMaestria = new EstudianteMaestria();
		estudianteMaestria.setNombre("Lionel");    //hered� el atributo de la clase padre Persona
		estudianteMaestria.caminar();              //hered� el m�todo de la clase padre Persona
		estudianteMaestria.becar();                //sobre escribi� por implementacion de interface Becable
		estudianteMaestria.contratar();            //sobre escribi� por implementacion de interface Contratable
		
		Ingeniero ingeniero = new Ingeniero();
		ingeniero.setNombre("Pedro");              //hered� el atributo de la clase padre Persona
		ingeniero.caminar();                       //hered� el m�todo de la clase padre Persona
		ingeniero.contratar();                     //sobre escribi� por implementacion de interface Contratable
		
	}

}
