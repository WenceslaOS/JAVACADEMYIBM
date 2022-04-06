package Bridge;

public class Ford extends Vehiculo {
	
	public Ford ( Motor motor ) {
		
		super ( motor );
		
	}

	@Override
	void mostrarCaracteristicas () {
		
		consumirGasolina ();
		
		
	}

	@Override
	public void inyectarCombustible ( Double combustible ) {
		
		motor.inyectarCombustible ( combustible );
		
	}

	@Override
	public void consumirGasolina () {
		
		motor.consumirGasolina ();
		
	}

}
