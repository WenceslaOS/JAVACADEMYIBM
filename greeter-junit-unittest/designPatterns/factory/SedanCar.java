package factory;

public class SedanCar implements Payment{

	@Override
	public void construct () {

		System.out.println ( "This is a SedanCar" );
		
	}

}
