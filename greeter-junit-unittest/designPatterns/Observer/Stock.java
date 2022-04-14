package Observer;

public class Stock {
	
	private String name;
    private Integer price;

    public Stock ( String name ) {

        this.name = name;

    }

    public String getName () {

        return name;

    }

    public void setName ( String name ) {

        this.name = name;

    }

    public Integer getPrice () {

        return price;

    }

    public void setPrice ( Integer price ) {

        this.price = price;

    }

}
