package Composite;

public class Triangulo implements Grafico {
	
	private Float base;
	private Float altura;
	
	public Triangulo ( Float base, Float altura ) {
		
		super ();
		this.base = base;
		this.altura = altura;
		
	}

	@Override
	public void pintar () {
		
		System.out.println ( "Triangulo de Base: " + this.base +
				"\n Y altura: " + this.altura );
		
	}

}
