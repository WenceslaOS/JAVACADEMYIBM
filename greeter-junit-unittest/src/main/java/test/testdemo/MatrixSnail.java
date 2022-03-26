package test.testdemo;

public class MatrixSnail {
	
	private Integer num;
	private int[][] matrix;
	
	public MatrixSnail ( Integer num ) {
		
		this.num = num;
		matrix = new int [ this.num ] [ this.num ]; 
		
	}
	
	public void constructMatrixSnail () {
		
		int auxRow = 0 ;
		int auxCol = -1;
		int cont = 0;
		int way = 1;
		int auxFor = num;
		
		for ( int n = 0; n < num; n++ ) {
			
			for ( int m = 0; m < auxFor; m++) {
				
				auxCol = auxCol + way;
				cont++;
				this.matrix[ auxRow ][ auxCol ] = cont;
					
				}
				
			auxFor--;
			
			for ( int m = 0; m < auxFor; m++ ) {
				
				auxRow = auxRow + way;
				cont++;
				this.matrix[ auxRow ][ auxCol ] = cont;
				
			}
			
			way = way * -1;
			
		}
			
	}
	
	public void print () {
		
		constructMatrixSnail ();
		
		for ( int n = 0; n < num; n++) {
			
			  System.out.print ( "|" );
			  
			  for ( int m = 0; m < num; m++) {
				  
				  System.out.print ( this.matrix[n][m] );
			    
				  if ( m != this.matrix[ n ].length-1 ) 
					  
					  System.out.print ( "\t" );
				  
			  }
			  
			  System.out.println ( "|" );
		}
		
	}
	

}
