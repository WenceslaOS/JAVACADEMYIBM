package Memento;

public class Originator {

	private String nombre;
	private String apellido;
	
	public Originator ( String nombre, String apellido ) {
		
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public Memento createMemento () {
		
		Memento memento = new Memento ( this.nombre, this.apellido );
		
		return memento;
		
	}
	
	public void restoreMemento ( Memento memento ) {
		
		this.nombre = memento.getNombre ();
		this.apellido = memento.getApellido ();
		
	}

	public String getNombre () {
		
		return nombre;
		
	}

	public void setNombre ( String nombre ) {
		
		this.nombre = nombre;
		
	}

	public String getApellido () {
		
		return apellido;
		
	}

	public void setApellido ( String apellido ) {
		
		this.apellido = apellido;
		
	}
	
}
