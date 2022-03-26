package test.testdemo;

public class MatrixDiagonal {
	
	private Integer num;
	private int[][] matrix;
	
	public MatrixDiagonal ( Integer num ) {
		
		this.num = num;
		matrix = new int [ this.num ] [ this.num ]; 
		
	}

	public void constructMatrixDiagonal () {
		
		int aux = num ;
		
		for ( int n = 0; n < num; n++ ) {
			
			aux--;
			
			for ( int m = 0; m < num; m++) {
			
				if ( n == 0 || n == ( num-1 ) ) {
					
					this.matrix[ n ][ m ] = 1;
					continue;
					
				}
					
				if ( n == m ) {
					
					this.matrix[ n ][ m ] = 1;
					continue;
					
				}
				
				if ( m == aux ) {
					
					this.matrix[ n ][ m ] = 1;
					continue;
					
				}
				
				this.matrix[ n ][ m ] = 0;
					
				}
					
			}
			
	}
	
	
	public void print () {
		
		constructMatrixDiagonal ();
		
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
