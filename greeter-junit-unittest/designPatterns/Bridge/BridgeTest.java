package Bridge;

public class BridgeTest {

	public static void main(String[] args) {
		
		Vehiculo ford = new Ford ( new Gasolina() ); 
		ford.mostrarCaracteristicas ();
		ford.inyectarCombustible ( 50D );
		
		Vehiculo ford1 = new Ford ( new Diesel() ); 
		ford1.mostrarCaracteristicas ();
		ford1.inyectarCombustible ( 70D );

	}

}
