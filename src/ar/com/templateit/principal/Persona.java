package ar.com.templateit.principal;

public class Persona {
	
	private String nombre;
	
	public void caminar() {
		System.out.println("La persona "+nombre+ " esta caminando...");
	}
	

	public Persona() {

	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
