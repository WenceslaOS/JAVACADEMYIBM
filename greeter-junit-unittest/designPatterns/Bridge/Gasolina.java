package Bridge;

public class Gasolina implements Motor {

	@Override
	public void inyectarCombustible ( Double combustible ) {
		
		System.out.println ( "Inyectaste " + combustible + " litros." );
		
	}

	@Override
	public void consumirGasolina () {

		System.out.println ( "Consume Gasolina" );
		
	}

}
