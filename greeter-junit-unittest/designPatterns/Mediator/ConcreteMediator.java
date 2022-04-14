package Mediator;

public class ConcreteMediator implements IMediator {

	private Tele tele;
	private Lampara lampara;
	
	
	public void setTele ( Tele tele ) {
		
		this.tele = tele;
		
	}

	public void setLampara ( Lampara lampara ) {
		
		this.lampara = lampara;
		
	}

	@Override
	public void encender ( Aparato aparato ) {
		
		if ( aparato == lampara ) 
			
			System.out.println ( "Lampara encendida." );
		
		else if ( aparato == tele )
			
			System.out.println ( "Television encendida." );
		else
			
			System.out.println ("Ese aparato no lo tenemos" );
		
	}

	@Override
	public void apagar ( Aparato aparato ) {
		
		if ( aparato == lampara ) 
			
			System.out.println ( "Lampara apagada." );
		
		else if ( aparato == tele )
			
			System.out.println ( "Television apagada." );
		else
			
			System.out.println ("Ese aparato no lo tenemos" );
		
	}

}
