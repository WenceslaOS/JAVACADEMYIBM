package test.testdemo;

public class Calculator {
	
	private Integer num1;
	private Integer num2;
	
	public Calculator () {
		
	}
	
	public Calculator ( Integer num1, Integer num2 ) {
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public void calculatorMethod () {
	
		AddAndSub addAndSub1 = ( num1, num2 ) -> num1 + num2;
		AddAndSub addAndSub2 = ( num1, num2 ) -> num1 - num2;
		OddAndPrime oddAndPrime1 = ( num1 ) -> ( num1 % 2 )==0;
		OddAndPrime oddAndPrime2 = ( num1 ) -> {
		
			for ( int i = 2; i < num1; i++) {
			
				if ( num1 % i == 0)
				
					return false;
			
			}
		
			return true;
		
		};
	
		Factorial factorial1 = ( num1 ) -> {
		
			int aux = 1;
		
			for ( int i = 1; i <= num1; i++ ) {
			
				aux = i * aux;
			}
		
			return aux;
		};
	
		System.out.println( adding ( addAndSub1, num1, num2 ));
		System.out.println( sub ( addAndSub2, num1, num2 ));
		System.out.println( odd ( oddAndPrime1, num1));
		System.out.println( prime ( oddAndPrime2, num1 ));
		System.out.println( factorial ( factorial1, num1 ));
	
	}



	public Integer getNum1() {
		return num1;
	}
	
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	
	public Integer getNum2() {
		return num2;
	}
	
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	
	public Integer adding ( AddAndSub Fi, Integer num1, Integer num2 ) {
		
		return Fi.addAndSub( num1, num2 );
		
	}
	
	public Integer sub ( AddAndSub Fi, Integer num1, Integer num2 ) {
		
		return Fi.addAndSub( num1, num2 );
		
	}
	
	public boolean odd ( OddAndPrime Fi, Integer num1 ) {
		
		return Fi.oddAndPrime( num1 );
		
	}
	
	public boolean prime ( OddAndPrime Fi, Integer num1 ) {
		
		return Fi.oddAndPrime( num1 );
		
	}
	
	public Integer factorial ( Factorial Fi, Integer num1 ) {
		
		return Fi.factorial( num1 );
		
	}

}
