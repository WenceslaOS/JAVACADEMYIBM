package decorator;

public class LecheDecorator extends AdicionalesDecorator {

	private Integer precioLeche = 10;
	
	public LecheDecorator ( Cafe decoratorAdicional ) {
		
		super ( decoratorAdicional );
		
	}
	
	private Integer configLeche () {
		
		return precioLeche;
		
	}
	
	@Override
	public String descripcion () {
		
		return this.decoratorAdicional.descripcion () + " con Leche";
		
	}

	@Override
	public Integer precio () {
		
		return this.decoratorAdicional.precio () + configLeche ();
		
	}

}
