package test.testdemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TheatreSet {

	private String cinemaName = new String();
	private Set<Seat> Seats = new LinkedHashSet<>(); 
	private Set<Seat> dummySet = new LinkedHashSet<>();
	private List<String> dummyListForPrint = new ArrayList<>();
	private final String[] nameRows= { "A","B","C","D","E","F","G","H","I","J","K","L"};
	private Integer numberOfRows;
	private Integer numberOfSeats;
	private Integer price;
	
	
	
	//TheatreSet Class constructor: 4 Params-Def.
	
	public TheatreSet(String cinemaName, Integer numberOfRows, Integer numberOfSeats,
			Integer price) {
		
		
		this.cinemaName = cinemaName;
		this.price = price;
		this.numberOfRows = numberOfRows;
		this.numberOfSeats = numberOfSeats;
		
		//Adding elements to Seats(List) for Control And DummySet(Set) for Print;
		
		for( int i=1; i<=numberOfRows; i++ ) {
			
			
			for(int j=1;j<=numberOfSeats;j++) {
				
				Seat auxSeat =  new Seat();
				auxSeat.setRow( nameRows[i-1] );
				auxSeat.setLine( String.valueOf( j ) );
				auxSeat.setPrice( 50 );
				Seats.add( auxSeat );
				
			}
		
		}
		
	}
	
	//reserve Method for TheatreSet.
	
	public boolean reserve ( String seatName ){
		
		char auxRow = seatName.charAt(0);
		char auxLine = seatName.charAt(1);
	
		//Watching if its already Reserved thru check Method
		
		if ( check( auxRow, auxLine, seatName ) ==  false) {	
		
			reserving( auxRow, auxLine );
			
			System.out.println( "But now " + seatName +" is reserved." );
			System.out.println( Seats );
			return true;
			
		}
		
		return false;
		
	}
	
	//cancelReservation Method for TheatreSet.
	
	public boolean cancelReservation ( String seatName ) {
		
		char auxRow = seatName.charAt(0);
		char auxLine = seatName.charAt(1);
		
		//Watching seat Status thru check Method.
		
		if ( check( auxRow, auxLine, seatName ) ==  true) {	
		
	    	reservingCancel( auxRow, auxLine );
			System.out.println("But now " + seatName +" is free." );
			System.out.println( Seats );
			return true;
		}
		
		return false;
	}
	
	//printCinema Method for TheatreSet.
	
	public void printCinema() {
		
		int totalFree = 0;
		int totalReserved = 0;
		
		System.out.println(this.cinemaName + "\n Price:" + this.price);
		
		for( Seat value: Seats )	{
			
			if( value.getReserved() == true) {
				
				totalReserved++;		
		    	this.dummyListForPrint.add("..");
				
				    }else {
				    	totalFree++;
				    	this.dummyListForPrint.add(value.getRow() + value.getLine());

				    }
			
		}
		System.out.println( dummyListForPrint );
		System.out.println("\n Total available:" + (this.numberOfRows*this.numberOfSeats) +
				"\n Total free:" + totalFree +
				"\n Total Reserved:" + totalReserved);
		
	}
	
	public void reservingCancel ( Character auxRow, Character auxLine ) {
		
		Seat auxSeat = new Seat();
		
		auxSeat.setRow( String.valueOf( auxRow ) );
		auxSeat.setLine( String.valueOf( auxLine ) );
		auxSeat.setPrice( this.price );
		auxSeat.setReserved( false );
		
		dummySet.removeAll( dummySet);
		
		for( Seat value: Seats) {
			
			dummySet.add(value);
			
		}
		
		Seats.removeAll(Seats);
		
		for( Seat value: dummySet) {
			
			if( value.getRow().charAt(0) == auxRow ) {
				
				if( value.getLine().charAt(0) == auxLine) {
					
					if( value.getReserved() == true) {
						
						Seats.add( auxSeat );
						
					}else {
						
						Seats.add( value );
					}
				}else {
					
					Seats.add( value );
					
					}
				}else {
				
				Seats.add( value );
			}
				
		}
	}
	
	//reserving Method remove and add elements in dummySeats(Set)
	
	public void reserving ( Character auxRow, Character auxLine ) {
		
		
		Seat auxSeat = new Seat();
		
		auxSeat.setRow( String.valueOf( auxRow ) );
		auxSeat.setLine( String.valueOf( auxLine ) );
		auxSeat.setPrice( this.price );
		auxSeat.setReserved( true );
		
		dummySet.removeAll( dummySet);
		
		for( Seat value: Seats) {
			
			dummySet.add(value);
			
		}
		
		Seats.removeAll(Seats);
		
		for( Seat value: dummySet) {
			
			if( value.getRow().charAt(0) == auxRow ) {
				
				if( value.getLine().charAt(0) == auxLine) {
					
					Seats.add( auxSeat );
					
				}else {
					
					Seats.add( value );
				
				}
			}else {
				
				Seats.add( value );
			}
				
		}
	}
	
	//check Method watch if seat is or not occupied.
	
	public boolean check ( Character auxRow, Character auxLine, String seatName ) {
		
		Seat auxSeat =  new Seat();
		auxSeat.setRow( String.valueOf( auxRow ) );
		auxSeat.setLine( String.valueOf( auxLine ) );
		auxSeat.setReserved( true );
		auxSeat.setPrice( this.price );
		
		//Cheking if Seat is free or reserved.
		
		for( Seat value: Seats )	{
			
			if( value.getRow().charAt(0) ==  auxRow ) {
				
				if( value.getLine().charAt(0) == auxLine ) {
					
					if( value.getReserved() == true) {
						
						System.out.println( seatName + ", Its already reserved.");
						return true;
						
					}else {
					
						System.out.println( seatName + ",Its Free." );
						return false;
					}
				}
				
			}
			
		}
			return true;
					
	}
	
}
