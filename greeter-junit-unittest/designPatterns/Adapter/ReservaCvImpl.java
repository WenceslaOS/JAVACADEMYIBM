package Adapter;

import java.util.Date;

public class ReservaCvImpl implements ReservaCv{
	
	private String idHotel;
	private String cliente;
	private Date fecha;
	private Integer dias;
	
	public ReservaCvImpl () {}

	@Override
	public String hotelInfo ( String idHotel ) {

		this.idHotel = idHotel;
		
		return idHotel;
	}

	@Override
	public Long creaReserva ( String idHotel, String cliente, Date fecha, Integer dias ) {
		
		this.idHotel = idHotel;
		this.cliente = cliente;
		this.fecha = fecha;
		this.dias = dias;
	
		return 40L;
		
	}

	@Override
	public String datoReserva ( Long codigo ) {
		
		return "600";
		
	}
	
	public String getReserva () {
		
		return "Reserva de: " + this.cliente + 
				"\nEn hotel: " + this.idHotel +
				"\nPara el dia: " + this.fecha +
				"\nPor: " + this.dias + " dias." +
				"\nReservaCv.";
		
	}

}
