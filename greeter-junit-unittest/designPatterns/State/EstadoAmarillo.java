package State;

public class EstadoAmarillo implements IEstadoSemaforo {
	
	@Override
	public void mostrar(Semaforo semaforo) {
		
		System.out.println ( "Amarillo... Amarillo...Amarillo..." );
		
	}

}
