package test.testdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class CalculatorTest2 {
	
	@InjectMocks
	Calculator calculator;
	
	@Mock
	AddAndSub addAndSub1;
	
	@Mock
	AddAndSub addAndSub2;
	
	@Mock
	OddAndPrime oddAndPrime1;
	
	@Mock
	OddAndPrime oddAndPrime2;
	
	@Mock
	Factorial factorial1;
	

	@BeforeEach
	void setUp () {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void addingTestPositive () {
		
		when(addAndSub1).thenReturn( addAndSub1 = ( num1, num2 ) -> num1 + num2 );
		
		assertEquals ( 7, calculator.adding( addAndSub1, 5, 2) );
		
	}
}
