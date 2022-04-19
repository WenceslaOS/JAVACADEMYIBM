package template;

public class TemplateTest {

	public static void main(String[] args) {
		
		Game game = new Soccer ();
		game.play ();
		
		System.out.println ( "-----------------------" );
		
		game = new Chess ();
		game.play ();
		
		
	}
	
	/* Terminal:
	 * 
	 * 	Iniciando Juego Soccer...
		Jugando Soccer...
		Cerrando juego...
		-----------------------
		Iniciando Juego Chess...
		Jugando Chess...
		Cerrando juego...
		
	 */

}
