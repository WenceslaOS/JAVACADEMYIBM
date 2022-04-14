package Memento;

public class MementoTest {

	public static void main(String[] args) {
	
		CareTaker careTaker = new CareTaker ();
		
		Originator originator = new Originator ( "Wenceslao", " Ordoñez" );
		
		System.out.println ( originator.getNombre () + originator.getApellido () );
		careTaker.setMemento ( originator.createMemento () );
		
		originator.setNombre( originator.getNombre () + " Geovani" );
		originator.setApellido( originator.getApellido () + " Garcia" );
		
		System.out.println ( originator.getNombre () + originator.getApellido () );
		
		careTaker.setMemento ( originator.createMemento () );
		
		originator.setNombre( originator.getNombre () + " Gerardo" );
		originator.setApellido( originator.getApellido () + " Del Olmo" );
		
		System.out.println ( originator.getNombre () + originator.getApellido () );
		
		careTaker.setMemento ( originator.createMemento () );
		
		Memento memento1 = careTaker.getMemento ( 0 );
		Memento memento2 = careTaker.getMemento( 1 );
		
		originator.restoreMemento ( memento1 );
		originator.restoreMemento ( memento2 );
		
		System.out.println ( originator.getNombre () + originator.getApellido () );
		
	}
	
	/* Terminal:
	 * 
		Wenceslao Ordoñez
		Wenceslao Geovani Ordoñez Garcia
		Wenceslao Geovani Gerardo Ordoñez Garcia Del Olmo
		Wenceslao Geovani Ordoñez Garcia

	 */

}
