package abstractFactory;

public class RelacionalFactory implements AbstractFactory < AlumnosRepository > {

	@Override
	public AlumnosRepository createRepositoryAlumnos( String repositoryType,
			Integer idAlumno, Integer idCurso ) {

		if ( "Relacional".equals( repositoryType ) ) {
			
			AlumnosRepository alumnosRepository = new AlumnosRelacionalRepository ();
			return alumnosRepository;
			
		}
		else if ( "NoSql".equals( repositoryType )) {
			
			AlumnosRepository alumnosRepository = new AlumnosNoSqlRepository ();
			return alumnosRepository;
			
		}
		else {
			
			return null;
		}
	}

	@Override
	public AlumnosRepository createRepositoryCursos( String RepositoryType,
			Integer idAlumno, Integer idCurso ) {
		
		return null;
		
	}
	
}
