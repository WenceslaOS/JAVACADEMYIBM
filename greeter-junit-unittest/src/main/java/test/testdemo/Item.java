package test.testdemo;

public class Item {
	
	private Integer id;
	private String name;
	private Integer price;
	
	public Item () {
		
	}
	
	public Item ( Integer id, String name, Integer price ) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public boolean equals (Item item)	{
		
		if( this.price > item.getPrice())
			return true;
		return false;
	}

	
}
