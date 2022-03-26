package test.testdemo;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class StreamChallengeTest {

	@InjectMocks
	StreamChallenge streamChallenge;
	
	@Mock
	ItemForStreamChallenge itemForStreamChallenge;
	
	@BeforeEach
	void setUp(){
		
		MockitoAnnotations.initMocks(this);
		
	}

	@Test
	void testFindMinPricePositive() {
		
		assertEquals( streamChallenge.findMinPrice().get(), 10 );
		
	}
	
	@Test
	void testFindMaxPricePositive() {
		
		assertEquals( streamChallenge.findMaxPrice().get(), 98 );
		
	}
	
	@Test
	void testFindCheapestAndAvailablePositive() {
		
		assertNotNull( streamChallenge.findCheapestAndAvailable());
		
	}
	
	@Test
	void testSortMaxToMinPositive() {
		
		assertNotNull( streamChallenge.sortPricesMaxToMin());
		
	}
	
	@ParameterizedTest
	@ValueSource (ints = { 1, 2, 3, 4, 5 } )
	void testFindById(int i) {
		
		assertNotNull( streamChallenge.findById(i));
		
	}
	
	@ParameterizedTest
	@ValueSource (strings = { "Iphone 13", "Galaxy S", "Ipad mini","Galaxy Tab" , "Note11" } )
	void testFindById(String name) {
		
		assertEquals( streamChallenge.findByName(name).get().getName(), name );
		
	}


}
