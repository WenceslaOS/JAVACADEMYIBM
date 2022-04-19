package strategy;

public class ConsoleLogger implements Logger {

	@Override
	public void write ( String text ) {
		
		System.out.println ( "Console: " + text );
		
	}

}
