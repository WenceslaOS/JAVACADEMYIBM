package Adapter;

import java.util.Date;

public interface StandarReservaAcme {
	
	String getInfo ( String idHotel );
	String createReserva ( Date fecha, Integer dias, String idHotel, String cliente );
	String datoReserva ( String codigo );

}
