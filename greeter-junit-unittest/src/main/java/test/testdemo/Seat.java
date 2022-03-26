package test.testdemo;

public class Seat {

	private String line;
	private String row;
	private Integer price;
	private Boolean reserved;
	
	public Seat() {
		this.reserved = false;
	}
	
	public Seat( String line, String row, Integer price ) {
		this.line = line;
		this.row = row;
		this.price = price;
		this.reserved = false;
	}
	
	
	

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public Integer getPrice() {
		return price;
	}
	public void setPrice( Integer price ) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		if( getReserved() == true)
			return "[Rsv]";
		else
		return "[" + row + line + "]";
	}
	public Boolean getReserved() {
		return reserved;
	}
	public void setReserved( Boolean reserved ) {
		this.reserved = reserved;
	}
	

	public boolean equals( Seat a ) {
		
		if( a.getLine().equals( line ) && a.getRow().equals( row ) ) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
