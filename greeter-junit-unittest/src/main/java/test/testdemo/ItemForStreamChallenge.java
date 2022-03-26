package test.testdemo;

public class ItemForStreamChallenge implements Comparable {

	private Integer id;
	private String name;
	private String description;
	private Integer price;
	private Boolean available;
	private String manufacturer;
	
	public ItemForStreamChallenge () {
		
		super();
		
	}

	public ItemForStreamChallenge (Integer id, String name, String description, Integer price, Boolean available,
			String manufacturer) {
		
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.available = available;
		this.manufacturer = manufacturer;
		
	}

	public Integer getId () {
		
		return id;
		
	}

	public String getName () {
		
		return name;
		
	}

	public String getDescription () {
		
		return description;
		
	}

	public Integer getPrice () {
		
		return price;
		
	}

	public Boolean getAvailable () {
		
		return available;
		
	}

	public String getManufacturer () {
		
		return manufacturer;
		
	}

	@Override
	public String toString() {
		return "ItemForStreamChallenge [id=" + id + ", name=" + name + ", price=" + price + ", available=" + available
				+ ", manufacturer=" + manufacturer + "]";
	}
	
	
	@Override
	public int compareTo(Object o) {
		
		ItemForStreamChallenge item = (ItemForStreamChallenge) o;
		
		return this.getPrice().compareTo( item.getPrice());
		
	}
	
	public boolean equals (String name) {
		
		
		if( this.getName().equals( name )  ) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
