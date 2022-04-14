package Mediator;

public class Tele extends Aparato {

	public Tele ( IMediator mediator ) {
		
		super(mediator);
		
	}

	@Override
	public void encender () {
		
		this.mediator.encender ( this );
		
	}

	@Override
	public void apagar () {
		
		this.mediator.apagar ( this );
		
	}
	
}
