package test.testdemo;

import java.util.Arrays;

public class TestArrayItem {
	
	private Item[] item = new Item[4];
	
	public TestArrayItem () {
		
		item[0] = new Item ( 1, "Item1", 45 );
		item[1] = new Item ( 2, "Item2", 30 );
		item[2] = new Item ( 3, "Item3", 20 );
		item[3] = new Item ( 4, "Item4", 70 );
		
		
	}
	
	public void compare() {
		
		Item auxItem = new Item ();
		
		for( int n = 0; n <= item.length; n++) {
			
			for( int valor = 0; valor <= item.length-2; valor++) {
				
				if( item[ valor ].equals( item[ valor+1 ] ) ) {
					
					auxItem = item[ valor ];
					item[ valor ] = item[ valor+1 ];
					item[ valor+1 ]= auxItem;
					valor = 0;
				}
				
			}
			
		}
		
		System.out.println ( Arrays.toString ( item ) );

	}

}
