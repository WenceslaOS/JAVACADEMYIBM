package test.testdemo;

import java.util.Arrays;

public class ArrayForSort {
	
	private static int[] arrTest = {6,3,1,2,7,5,4,8,9};
	
	public static void forSort () {
		
		Arrays.sort ( arrTest );

		System.out.println ( Arrays.toString ( arrTest ) );
		
	}

}
