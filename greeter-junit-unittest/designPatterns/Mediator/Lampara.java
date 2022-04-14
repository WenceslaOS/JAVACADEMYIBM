package Mediator;

public class Lampara extends Aparato {

	public Lampara ( IMediator mediator ) {
		
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
