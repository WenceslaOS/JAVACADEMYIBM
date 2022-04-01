package abstractFactory;

public class ProviderFactory {
	

	public static void getFactory ( String repositoryType, Integer idAlumno, Integer idCurso) {
		
			AbstractFactory abstractFactory1 = new RelacionalFactory ();
			AlumnosRepository alumno =  (AlumnosRepository) abstractFactory1.createRepositoryAlumnos ( repositoryType, idAlumno, idCurso );
			System.out.println( alumno.listaAlumnos()[ idAlumno-1 ]);
			
			AbstractFactory abstractFactory2 = new NoSqlFactory ();
			CursosRepository curso =  (CursosRepository) abstractFactory2.createRepositoryCursos ( repositoryType, idAlumno, idCurso );
			System.out.println( curso.listaCursos()[ idCurso-1 ]);
		
	}
}
