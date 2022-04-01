package abstractFactory;

public class CursoNoSqlRepository implements CursosRepository {

	private String[] cursos = new String[] {"Curso NoSql 1", "Curso NoSql 2"};
	
	@Override
	public String[] listaCursos() {
		
		return this.cursos;
		
	}
	
}
