package test.testdemo;

import java.util.ArrayList;
import java.util.List;

public class TheatreList {
	
	private String cinemaName = new String();
	private List<Seat> seats = new ArrayList<Seat>();
	private final String[] nameRows= { "A","B","C","D","E","F","G","H","I","J","K","L"};
	private Integer numberOfRows;
	private Integer numberOfSeats;
	private Integer price;
	private Seat auxSeat = new Seat();
	private Integer index;
	
	
	//TheatreList Class constructor: 4 Params-Def.
	
	public TheatreList(String cinemaName, Integer numberOfRows, Integer numberOfSeats,
			Integer price) {
		
		
		this.cinemaName = cinemaName;
		this.price = price;
		this.numberOfRows = numberOfRows;
		this.numberOfSeats = numberOfSeats;
		
		//Adding elements to Seats(List) for Control And Print;
		
		for( int i=1; i<=numberOfRows; i++ ) {
			
			
			for(int j=1;j<=numberOfSeats;j++) {
				
				Seat auxSeat =  new Seat();
				auxSeat.setRow( nameRows[i-1] );
				auxSeat.setLine( String.valueOf( j ) );
				auxSeat.setPrice( 50 );
				seats.add( auxSeat );
				
			}
		
		}
		
	}
	
	//reserve Method for TheatreList Class.
	
	public boolean reserve ( String seatName ){
		
		char auxRow = seatName.charAt(0);
		char auxLine = seatName.charAt(1);
	
		//Watching if its already Reserved thru check Method
		
		if ( check( auxRow, auxLine, seatName ) ==  false) {	
		
			
	    	seats.set( index, auxSeat ).setReserved(true);
			System.out.println("But now " + seatName +" is reserved." );
			System.out.println( seats );
			return true;
		
		}
		
		return false;
	}
	
	//cancelReservation Method for TheatreList Class.
	
	public boolean cancelReservation ( String seatName ) {
		
		char auxRow = seatName.charAt(0);
		char auxLine = seatName.charAt(1);
		
		//Watching seat Status thru check Method.
		
		if ( check( auxRow, auxLine, seatName ) ==  true) {	
		
	    	seats.set( index, auxSeat ).setReserved(false);
			System.out.println("But now " + seatName +" is free." );
			System.out.println( seats );
			return true;
		}
		
		return false;
	}
	
	//printCinema Method for TheatreList Class.
	
	public void printCinema() {
		
		Seat auxSeat = new Seat();
		int totalFree = 0;
		int totalReserved = 0;
		
		System.out.println(this.cinemaName + "\n Price:" + this.price);
		
		for( int n=0; n<=seats.size()-1; n++ )	{
			
			auxSeat = seats.get( n );
			
			if( auxSeat.getReserved() == true) {
				
				totalReserved++;
				
				    }else {
				    	totalFree++;
				    }
			
		}
		System.out.println( seats );
		System.out.println("\n Total available:" + (this.numberOfRows*this.numberOfSeats) +
				"\n Total free:" + totalFree +
				"\n Total Reserved:" + totalReserved);
		
	}
	
	//check Method watch if seat is free or not.
	
	public boolean check (Character auxRow, Character auxLine, String seatName ) {
		
		Seat auxSeat =  new Seat();
		
		//Checking if Seat is free or reserved.
		
		for( int n=0; n<=seats.size()-1; n++ )	{
			auxSeat = seats.get( n );
			
			if( auxSeat.getRow().charAt(0) == auxRow ) {
				
				if( auxSeat.getLine().charAt(0) == auxLine ){
					
					if( auxSeat.getReserved() == true) {
						
						System.out.println( seatName + ", Its already reserved.");
						return true;
				
				    }else {
				    	this.auxSeat =auxSeat;
				    	this.index = n;
				    	System.out.println( seatName + ",Its Free." );
				    	return false;
				    }
					
				}
				
			}
			
		}
		System.out.println( "Seat Doesn't exist");
		return true;
	}

}
