package Bridge;

public abstract class Vehiculo implements Motor {
	
	protected Motor motor;
	
	public Vehiculo ( Motor motor) {
		
		this.motor = motor;
	}
	
	abstract void mostrarCaracteristicas ();
	

}
