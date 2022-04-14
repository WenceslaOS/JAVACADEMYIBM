package Mediator;

public abstract class Aparato {
	
	protected IMediator mediator;
	
	public Aparato ( IMediator mediator ) {
		
		super();
		this.mediator = mediator;
		
	}

	public abstract void encender ();
	
	public abstract void apagar ();
	
}
