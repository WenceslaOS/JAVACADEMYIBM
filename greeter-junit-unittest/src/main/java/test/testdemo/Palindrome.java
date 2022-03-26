package test.testdemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
	
	

	
	public static boolean isPalindrome( String word ) {
		
		Queue<Character> ptqueue = new LinkedList<>();
		Deque<Character>  dqe = new ArrayDeque<>();
		
		for(int i=0;i<=word.length()-1;i++) {
			ptqueue.add(word.charAt(i));
			dqe.add(word.charAt(i));
		}
		
			
		for(int i=0;i<=word.length()-1;i++) {
			Character e = ptqueue.poll();
			Character d = dqe.pollLast();
			if(e!=d)
				return false;
		}
		
		return true;
	}
	
}
