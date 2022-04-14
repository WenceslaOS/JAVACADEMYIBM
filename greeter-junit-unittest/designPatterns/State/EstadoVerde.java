package State;

public class EstadoVerde implements IEstadoSemaforo {

	@Override
	public void mostrar(Semaforo semaforo) {
		
		System.out.println ( "Verde...Verde...Verde..." );
		
	}

}
