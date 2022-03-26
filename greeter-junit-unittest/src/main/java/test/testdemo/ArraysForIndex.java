package test.testdemo;

import java.util.Arrays;

public class ArraysForIndex {
	
	private static int[] arrTest = {6,3,1,2,7,5,4,8,9};
	
	public static void forIndex () {
		
		
		int temp = 0;
		
		for( int n=0; n <= arrTest.length; n++ ) {
			
			for( int valor = 0; valor <= arrTest.length-2; valor++) {
			
				if( arrTest[ valor ] > arrTest[ valor+1 ] ) {
				
					temp = arrTest[ valor ];
					arrTest[ valor ] = arrTest[ valor+1 ];
					arrTest[ valor+1 ] = temp;
					valor = 0;
					
				}
				
			}
			
		}
		
	
		
		System.out.println ( Arrays.toString ( arrTest ) );		
	}

}
