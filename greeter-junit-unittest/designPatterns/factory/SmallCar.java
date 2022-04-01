package factory;

public class SmallCar implements Payment{

	@Override
	public void construct () {

		System.out.println ( "This is a SmallCar" );
		
	}

}
