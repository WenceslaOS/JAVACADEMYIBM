package decorator;

public class Descafeinado implements Cafe{

	private Integer precio = 60;
	
	@Override
	public String descripcion () {
		
		return "Cafe descafeinado";
		
	}

	@Override
	public Integer precio () {
		
		return this.precio;
		
	}

}
