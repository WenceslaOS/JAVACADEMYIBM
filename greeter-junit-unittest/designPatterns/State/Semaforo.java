package State;

public class Semaforo {
	
	private IEstadoSemaforo actualEstado;

	public Semaforo () {
		
		super();
		this.actualEstado = new EstadoVerde ();
		
	}
	
	public void setEstate ( IEstadoSemaforo estadoSemaforo ) {
		
		this.actualEstado = estadoSemaforo;
		
	}
	
	public void mostrar () {
		
		this.actualEstado.mostrar ( this );
		
	}
	
}
