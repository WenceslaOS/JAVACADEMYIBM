package abstractFactory;

public class CursoRelacionalRepository implements CursosRepository{

	private String[] cursos = new String[] {"Curso Relacional 1", "Curso Relacional 2"};
	private String cardNumber;
	private String cardType;
	
	
	@Override
	public String[] listaCursos () {
		
		return this.cursos;
		
	}

	public String getCardNumber () {
		
		return cardNumber;
		
	}
	
	public String getCardType () {
		
		return cardType;
		
	}

}
