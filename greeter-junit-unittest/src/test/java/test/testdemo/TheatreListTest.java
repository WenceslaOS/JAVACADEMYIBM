package test.testdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TheatreListTest {
	
	TheatreList theatreList;
	Seat seat = mock(Seat.class);

	@BeforeEach
	void setUp() {
		theatreList = new TheatreList("Cinema Java", 3, 3 , 50);
		
	}

	@ParameterizedTest
	@ValueSource(strings= { "A3", "B2", "C3" })
	void testreserveTrue (String seatName) {
		assertTrue( theatreList.reserve(seatName) );
	}

	
	@ParameterizedTest
	@ValueSource(strings= { "A4", "B6", "C7" })
	void testreserveFalse (String seatName) {
		assertFalse( theatreList.reserve(seatName) );
	}
	
	@ParameterizedTest
	@ValueSource(strings= { "A3","B2","C3" })
	void testCancelReservationTrue (String seatName) {
		theatreList.reserve(seatName);
		assertTrue( theatreList.cancelReservation(seatName) );
	}
	
	@ParameterizedTest
	@ValueSource(strings= { "A3", "B2", "C1" })
	void testCancelReservationFalse (String seatName) {
		assertFalse( theatreList.cancelReservation(seatName) );
	}
}

