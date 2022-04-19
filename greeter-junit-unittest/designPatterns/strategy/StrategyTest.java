package strategy;

public class StrategyTest {

	public static void main(String[] args) {
		
		App app = new App ( new ConsoleLogger () );
		app.run( "Este mensaje sera Loggeado a traves de la consola." );
		
		System.out.println ( "----------------" );
		
		App app1 = new App ( new FileLogger () );
		app1.run( "Este mensaje sera Loggeado a traves de un archivo." );

	}
	
	/* Terminal:
	 * 
	 * 	Console: Este mensaje sera Loggeado a traves de la consola.
		----------------
		Console: Este mensaje sera Loggeado a traves de un archivo.
		
	 */

}
