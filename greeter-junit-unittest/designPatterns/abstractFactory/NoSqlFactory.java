package abstractFactory;

public class NoSqlFactory implements AbstractFactory < CursosRepository > {

	@Override
	public CursosRepository createRepositoryAlumnos( String repositoryType,
			Integer idAlumno, Integer idCurso) {
		
		return null;
		
	}

	@Override
	public CursosRepository createRepositoryCursos ( String repositoryType,
			Integer idAlumno, Integer idCurso ) {

		if ( "Relacional".equals( repositoryType ) ) {
			
			CursosRepository cursosRepository = new CursoRelacionalRepository ();
			return cursosRepository;
			
		}
		else if ( "NoSql".equals( repositoryType )) {
			
			CursosRepository cursosRepository = new CursoNoSqlRepository ();
			return cursosRepository;
			
		}
		else {
			
			return null;
		}
		
	}

}
