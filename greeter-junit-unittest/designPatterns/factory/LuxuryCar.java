package factory;

public class LuxuryCar implements Payment{

	@Override
	public void construct () {

		System.out.println ( "This is a LuxuryCar" );
		
	}

}
