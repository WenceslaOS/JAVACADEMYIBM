package Mediator;

public class MediatorTest {

	public static void main(String[] args) {
		
		ConcreteMediator concreteMediator = new ConcreteMediator ();
		Lampara lampara = new Lampara ( concreteMediator );
		Tele tele = new Tele ( concreteMediator );
		
		concreteMediator.setLampara ( lampara );
		concreteMediator.setTele ( tele );
		
		tele.encender ();
		lampara.encender ();
		
		System.out.println ( "\n--------------------------------\n");
		
		tele.apagar ();
		lampara.apagar ();

	}
	
	/* Terminal:
	 * 
	 * 	Television encendida.
		Lampara encendida.
		
		--------------------------------
		
		Television apagada.
		Lampara apagada.

	 */

}
