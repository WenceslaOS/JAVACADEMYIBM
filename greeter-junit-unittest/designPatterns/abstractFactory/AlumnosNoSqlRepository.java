package abstractFactory;

public class AlumnosNoSqlRepository implements AlumnosRepository{
	
	private String[] alumnos = new String[]{"Alumno NoSql 1", "Alumno NoSql 2"};

	@Override
	public String[] listaAlumnos() {
		
		return this.alumnos;
		
	}

}
