package Adapter;

import java.util.Date;

public interface ReservaCv {
	
	String hotelInfo ( String idHotel );
	Long creaReserva ( String idHotel, String cliente, Date fecha, Integer dias );
	String datoReserva ( Long codigo );

}
