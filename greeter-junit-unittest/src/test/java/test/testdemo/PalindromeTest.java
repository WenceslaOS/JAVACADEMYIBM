package test.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeTest {

	@ParameterizedTest
	@ValueSource(strings = {"civic", "ana", "tenet"})
	void testIsPalindromeTrue(String word) {
		assertTrue(Palindrome.isPalindrome(word));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"banana", "bitcoin", "line"})
	void testIsPalindromeFalse(String word) {
		assertFalse(Palindrome.isPalindrome(word));
	}
	

}
