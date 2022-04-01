package factory;

public class CarFactory {
	
	public static Payment bulidCar ( CarType carType ) {
		
		switch ( carType ) {
			
			case Small:
				
				return new SmallCar ();
				
			case Luxury:
				
				return new LuxuryCar ();
				
			case Sedan:
				
				return new SedanCar ();
			
			default:
				
				return null;
			
		}
		
	}

}
