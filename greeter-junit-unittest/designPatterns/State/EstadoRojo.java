package State;

public class EstadoRojo implements IEstadoSemaforo {

	@Override
	public void mostrar(Semaforo semaforo) {
		
		System.out.println ( "Rojo...Rojo...Rojo..." );
		
	}
	
}
