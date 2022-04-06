package Composite;

public class Cuadrado implements Grafico {
	
	private Float lado;
	
	public Cuadrado ( Float lado ) {
		
		super ();
		this.lado = lado;
		
	}


	@Override
	public void pintar () {
		
		System.out.println ( "Cuadrado de Lado: " + this.lado );
		
	}

}
