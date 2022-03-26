package test.testdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TheatreSetTest {

	TheatreSet theatreSet;
	Seat seat = mock(Seat.class);

	@BeforeEach
	void setUp() {
		theatreSet = new TheatreSet("Cinema Java", 3, 3 , 50);
		
	}

	@ParameterizedTest
	@ValueSource(strings= { "A3", "B2", "C3" })
	void testreserveTrue (String seatName) {
		assertTrue( theatreSet.reserve(seatName) );
	}

	
	@ParameterizedTest
	@ValueSource(strings= { "A4", "B6", "C7" })
	void testreserveFalse (String seatName) {
		assertFalse( theatreSet.reserve(seatName) );
	}
	
	@ParameterizedTest
	@ValueSource(strings= { "A3","B2","C3" })
	void testCancelReservationTrue (String seatName) {
		theatreSet.reserve(seatName);
		assertTrue( theatreSet.cancelReservation(seatName) );
	}
	
	@ParameterizedTest
	@ValueSource(strings= { "A3", "B2", "C1" })
	void testCancelReservationFalse (String seatName) {
		assertFalse( theatreSet.cancelReservation(seatName) );
	}
}
