package Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		NotaList notaList = new NotaList ( "practica * 0.2 + conducta * 0.1 + examen * 0.7" );
		IIterator iterator = notaList.iterator ();
		
		while ( iterator.hasNext() ) {
			
			Nota nota = ( Nota ) iterator.next ();
			System.out.println ( nota.getNota() );
		}

	}
	
	/* Terminal:
	 * 
	 * 	practica
		0.2
		*
		+
		conducta
		0.1
		*
		+
		examen
		0.7
		*
	 */

}
