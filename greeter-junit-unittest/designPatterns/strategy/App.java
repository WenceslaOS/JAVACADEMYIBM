package strategy;

public class App {
	
	Logger logger;

	public App ( Logger logger ) {
		
		super ();
		this.logger = logger;
		
	}
	
	public void run ( String text ) {
		
		logger.write ( text );
		
	}

}
