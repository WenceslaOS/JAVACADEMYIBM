package Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List < Memento > mementos = new ArrayList <> ();
	
	public void setMemento ( Memento memento ) {
		
		mementos.add ( memento );
		
	}
	
	public Memento getMemento ( int index ) {
		
		return mementos.get ( index );
		
	}

}
