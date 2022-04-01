package factory;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		Payment carFactory = CarFactory.bulidCar ( CarType.Small );
		carFactory.construct ();

	}

}
