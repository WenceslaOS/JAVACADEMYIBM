package decorator;

public abstract class AdicionalesDecorator implements Cafe {

	protected Cafe decoratorAdicional;
	
	public AdicionalesDecorator ( Cafe decoratorAdicional ) {
		
		this.decoratorAdicional = decoratorAdicional;
		
	}
	
	@Override
	public String descripcion () {
		
		return this.decoratorAdicional.descripcion ();
		
	}

	@Override
	public Integer precio () {
		
		return this.decoratorAdicional.precio ();
		
	}

}
