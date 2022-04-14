package Command;

public class Pedido {
	
	private int peso;
	private String urgencia;
	
	public Pedido ( int peso, String urgencia ) {
		
		super();
		this.peso = peso;
		this.urgencia = urgencia;
		
	}

	public void setPeso ( int peso ) {
		
		this.peso = peso;
		
	}
	
	public int getPeso () {
		
		return this.peso;
		
	}
	
	public boolean isUrgente (  ) {
		
		if ( "Si".equals ( this.urgencia ) ) {
			
			System.out.println ( "Es Urgente" );
			
			return true;
			
		}
		else if ( "No".equals ( this.urgencia ) ) {
			
			System.out.println ( "No es Urgente " );
			
			return false;
			
		}
		else {
			
			System.out.println ( "Ese no es un tipo de urgencia" );
			
			return (Boolean) null;
			
		}
		
	}

}
