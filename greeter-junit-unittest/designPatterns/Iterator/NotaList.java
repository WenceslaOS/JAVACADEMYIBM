package Iterator;

public class NotaList implements IList {
	
	private int num;
	private Nota [] notas;
	
    public NotaList ( String notas ) {

        String [] auxStr = notas.split (" ");
        this.num = auxStr.length + 1 ;
        this.notas = new Nota [num];

        for ( int i = 1; i < auxStr.length + 1; i++ ) {
        	
            this.notas [i] = new Nota ( auxStr [i-1] );
            
        }

    }

    @Override
    public IIterator iterator() {

        return new NotaIterator ( this.notas );

    }

}
