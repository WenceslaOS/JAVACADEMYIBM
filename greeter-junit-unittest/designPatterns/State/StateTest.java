package State;

public class StateTest {

	public static void main(String[] args) {
		
		Semaforo semaforo = new Semaforo ();
		semaforo.mostrar();
		
		semaforo.setEstate( new EstadoAmarillo () );
		semaforo.mostrar();
		
		semaforo.setEstate( new EstadoRojo () );
		semaforo.mostrar();

	}
	
	/* Terminal:
		Verde...Verde...Verde...
		Amarillo... Amarillo...Amarillo...
		Rojo...Rojo...Rojo...
*/

}
