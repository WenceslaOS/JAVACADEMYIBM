package Iterator;

public class NotaIterator implements IIterator {
	
	private Nota [] notas;
    private int position;
    private int auxPaar = -1;
    private int auxFour = 1;
    private int auxThree = 1;
    private int auxTot = 0;

    public NotaIterator ( Nota[] notas ) {

        this.notas = notas;
        this.position = 1;

    }

    @Override
    public Boolean hasNext () {
    	
    	if ( this.position > notas.length - 1 ) {
    		
    		return false;
    	
    	}
    	
    	return true;
    }

    @Override
    public Object next () {
    	
    	if ( auxFour < 4 ) {
    		
    		if ( this.auxPaar < 3 ){
    	    	
       		 this.auxPaar = this.auxPaar + 2;
       	     this.position = this.position + 1;
       	     this.auxFour++;
       	     return notas [ ( this.auxPaar ) + this.auxTot ];
          
           
    		}
    		else {
	       		
	       		this.auxThree++;
	       		this.auxFour++;
	       		this.position = this.position + 1;
	       		return notas [ ( this.auxThree ) + this.auxTot ];
	       	
	       	}
    		
    	}
    	else if ( auxFour == 4 ){
    		
    		
    		this.auxFour++;
    		this.position = this.position + 1;
       		return notas [ ( this.auxFour -1 ) + this.auxTot ];
    		
    	}
    	else {
    		
    		this.auxPaar = -1;
    		this.auxThree = 1;
    		this.auxTot = this.auxTot + 4;
    		this.auxFour = 1;
    		return next();
    	}
    	
    	
    }

    @Override
    public Object currentItem () {
    	
        return notas [ position ];
        
    }

}
