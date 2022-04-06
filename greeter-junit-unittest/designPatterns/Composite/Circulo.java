package Composite;

public class Circulo implements Grafico {

	private Float radio;
	
	public Circulo ( Float radio ) {
		
		super ();
		this.radio = radio;
		
	}



	@Override
	public void pintar () {
		
		System.out.println ( "Circulo de Radio: " + this.radio );
		
	}

}
