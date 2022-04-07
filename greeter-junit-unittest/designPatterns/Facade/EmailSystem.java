package Facade;

public class EmailSystem implements ISystem {
	
	@Override
	public void doSomething() {
		
		System.out.println ( "Send Mail." );
		
	}

}
