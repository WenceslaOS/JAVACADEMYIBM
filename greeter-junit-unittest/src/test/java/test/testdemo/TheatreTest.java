/*package test.testdemo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.mock.*;
import org.junit.jupiter.api.BeforeEach;


public class TheatreTest {

	Seat seat = mock(Seat.class);
	Theatre theatre;
	
	@BeforeEach
	void setup() {
		theatre = new Theatre();
	}
	
	@Test
	public void testReserve() {
		
		when(seat.equals()).thenReturn(true);
		
		assertEquals(theatre.reserve()));
	
	}

}*/
