package Adapter;

import java.util.Date;

public class AdapterTest {

	public static void main(String[] args) {
		
		ReservaCvImpl ReservaCv = new ReservaCvImpl ();
		ReservaCv.creaReserva( "A41", "Jorge", new Date ( 2022, 3, 3 ), 15 );
		
		StandarReservaAdapter standarReservaAdapter = new StandarReservaAdapter ( ReservaCv );
		System.out.println( standarReservaAdapter.getReserva () );
		standarReservaAdapter.createReserva( new Date( 2022, 9, 9 ), 20, "A40", "Claudio" );
		System.out.println( standarReservaAdapter.getReserva() );
		
		

	}

}
