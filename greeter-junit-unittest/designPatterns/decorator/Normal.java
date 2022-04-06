package decorator;

public class Normal implements Cafe {

	private Integer precio = 50;
	
	@Override
	public String descripcion () {
		
		return "Cafe normal";
		
	}

	@Override
	public Integer precio () {
		
		return this.precio;
		
	}

}
