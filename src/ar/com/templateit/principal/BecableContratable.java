package ar.com.templateit.principal;

//Herencia multiple en la interface
public interface BecableContratable extends Becable, Contratable{
	
	//con java 8 se pueda hacer metodos default
	//para no oblicar sobre escribir a las clases
	//que implemente esta interface
	@Override
	public default void becar() {
		System.out.println("Persona becada...");
		
	}

	//con java 8 se pueda hacer metodos default
	//para no oblicar sobre escribir a las clases
	//que implemente esta interface
	@Override
	public default void contratar() {
		System.out.println("Persona contratada...");
		
	}

}
