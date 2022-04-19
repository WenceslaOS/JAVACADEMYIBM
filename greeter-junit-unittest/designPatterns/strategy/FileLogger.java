package strategy;

public class FileLogger implements Logger {
	
	@Override
	public void write ( String text ) {
		
		System.out.println ( "File: " + text );
		
	}

}
