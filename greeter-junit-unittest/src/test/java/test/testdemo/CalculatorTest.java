package test.testdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CalculatorTest {
	
	@Mock
	private AddAndSub addAndSub1;
	
	@Mock
	private AddAndSub addAndSub2;
	
	@Mock
	private OddAndPrime oddAndPrime1;
	
	@Mock
	private OddAndPrime oddAndPrime2;
	
	@Mock
	private Factorial factorial1;
	
	Calculator calculator;

	@BeforeEach
	void setUp () {
		
		calculator = new Calculator();
		addAndSub1 = ( num1, num2 ) -> num1 + num2;
		addAndSub2 = ( num1, num2 ) -> num1 - num2;
		oddAndPrime1 = ( num1 ) -> ( num1 % 2 )==0;
		oddAndPrime2 = ( num1 ) -> {
			
			for ( int i = 2; i < num1; i++) {
				
				if ( num1 % i == 0)
					
					return false;
				
			}
			
			return true;
			
		};
		
		factorial1 = ( num1 ) -> {
			
			int aux = 1;
			
			for ( int i = 1; i <= num1; i++ ) {
				
				aux = i * aux;
			}
			
			return aux;
		};
	
	}

	@Test
	void addingTestPositive () {
		
		assertEquals ( 7, calculator.adding( addAndSub1, 5, 2) );
		
	}
	
	@Test
	void addingTestNegative () {
		
		assertNotEquals ( 5, calculator.adding( addAndSub1, 5, 2) );
		
	}
	
	@Test
	void subTestPositive () {
		
		assertEquals ( 3, calculator.adding( addAndSub2, 5, 2) );
		
	}
	
	@Test
	void subTestNegative () {
		
		assertNotEquals ( 5, calculator.adding( addAndSub2, 5, 2) );
		
	}
	
	@Test
	void oddTestPositive () {
		
		assertTrue ( calculator.odd( oddAndPrime1, 6) );
		
	}
	
	@Test
	void oddTestNegative () {
		
		assertFalse ( calculator.odd( oddAndPrime1, 7 ) );
		
	}
	
	@Test
	void primeTestPositive () {
		
		assertTrue ( calculator.prime( oddAndPrime2, 7 ) );
		
	}
	
	@Test
	void primeTestNegative () {
		
		assertFalse ( calculator.prime( oddAndPrime2, 4 ) );
		
	}
	
	@Test
	void factorialTestPositive () {
		
		assertEquals ( 120 ,calculator.factorial( factorial1, 5 ) );
		
	}

}
