package abstractFactory;

public interface AbstractFactory < T > {
	
	T createRepositoryAlumnos ( String repositoryType, Integer idAlumno, Integer idCurso );
	T createRepositoryCursos ( String RepositoryType, Integer idAlumno, Integer idCurso );
	

}
