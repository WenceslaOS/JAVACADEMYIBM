package decorator;

public class AzucarDecorator extends AdicionalesDecorator {
	
	private Integer precioAzucar = 5;
	
	public AzucarDecorator ( Cafe decoratorAdicional ) {
		
		super ( decoratorAdicional );
		
	}
	
	private Integer configAzucar () {
		
		return precioAzucar;
		
	}
	
	@Override
	public String descripcion () {
		
		return this.decoratorAdicional.descripcion () + " con Azucar";
		
	}

	@Override
	public Integer precio () {
		
		return this.decoratorAdicional.precio () + configAzucar ();
		
	}

}
