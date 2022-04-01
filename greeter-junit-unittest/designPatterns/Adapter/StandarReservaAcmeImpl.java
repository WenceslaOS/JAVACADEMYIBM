package Adapter;

import java.util.Date;

public class StandarReservaAcmeImpl implements StandarReservaAcme {
	
	private String idHotel;
	private String cliente;
	private Date fecha;
	private Integer dias;
	
	@Override
	public String getInfo ( String idHotel ) {

		this.idHotel = idHotel;
		
		return idHotel;
		
	}

	@Override
	public String createReserva ( Date fecha, Integer dias, String idHotel, String cliente ) {
		
		this.fecha = fecha;
		this.dias = dias;
		this.idHotel = idHotel;
		this.cliente = cliente;
		
		return "Reserva de " + cliente + " hecha";
		
	}

	@Override
	public String datoReserva ( String codigo ) {
		
		return "6010";
		
	}
	
	public String getReserva () {
		
		return 	"Reserva de: " + this.cliente + 
				"\nEn hotel: " + this.idHotel +
				"\nPara el dia: " + this.fecha +
				"\nPor: " + this.dias + " dias." +
				"\nReservaAcme.";
		
	}

}
