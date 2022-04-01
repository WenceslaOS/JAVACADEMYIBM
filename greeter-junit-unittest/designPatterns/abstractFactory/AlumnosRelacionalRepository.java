package abstractFactory;

public class AlumnosRelacionalRepository implements AlumnosRepository{

	private String[] alumnos = new String[]{"Alumnoo Relacional 1","Alumno Relacional 2"};
	
	@Override
	public String[] listaAlumnos() {
		
		return this.alumnos;
		
	}

}
