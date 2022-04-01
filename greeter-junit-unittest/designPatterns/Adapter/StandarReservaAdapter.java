package Adapter;

import java.util.Date;

public class StandarReservaAdapter implements StandarReservaAcme{

	private ReservaCvImpl miSystema;
	
	public StandarReservaAdapter () {}
	
	public  StandarReservaAdapter ( ReservaCvImpl miSystema ) {
	
		this.miSystema = miSystema;
		
	}
	
	@Override
	public String getInfo ( String idHotel ) {
		
		return this.miSystema.hotelInfo( idHotel );
		
	}

	@Override
	public String createReserva ( Date fecha, Integer dias, String idHotel, String cliente ) {
		
		String reserva = Long.toString( this.miSystema.creaReserva ( idHotel, cliente, fecha, dias ).longValue() );
		
		return reserva;
	}

	@Override
	public String datoReserva ( String codigo ) {
		
		Long reserva = Long.parseLong ( codigo );
		return miSystema.datoReserva ( reserva );
		
	}
	
	public String getReserva () {
		
		return this.miSystema.getReserva();
		
	}

}
