package decorator;

public class CremaDecorator extends AdicionalesDecorator {
	
private Integer precioCrema = 15;
	
	public CremaDecorator ( Cafe decoratorAdicional ) {
		
		super ( decoratorAdicional );
		
	}
	
	private Integer configCrema () {
		
		return precioCrema;
		
	}
	
	@Override
	public String descripcion () {
		
		return this.decoratorAdicional.descripcion () + " con crema";
		
	}

	@Override
	public Integer precio () {
		
		return this.decoratorAdicional.precio () + configCrema ();
		
	}

}
