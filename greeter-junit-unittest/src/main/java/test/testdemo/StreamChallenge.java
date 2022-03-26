package test.testdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamChallenge {
	
	private List < ItemForStreamChallenge > items = new ArrayList <> ();
	
	public StreamChallenge () {
		
		Collections.addAll ( this.items, new ItemForStreamChallenge ( 1, "Iphone 13","Cellphone", 10,
				false, "Apple" ),
				new ItemForStreamChallenge ( 2, "Ipad mini","Tablet", 55, true, "Apple" ),
				new ItemForStreamChallenge ( 3, "Galaxy Tab","Tablet", 70, true, "Samsung" ),
				new ItemForStreamChallenge ( 4, "Galaxy S","Cellphone", 15, true, "Samsung" ),
				new ItemForStreamChallenge ( 5, "Note11","Cellphone", 98, true, "Xiaomi" ) );
	}
	
	public Optional < Integer > findMinPrice () {
		
		return this.items
				.stream()
				.map( i -> i.getPrice() )
				.min( Comparator.naturalOrder () );
		
	}
	
	public Optional < Integer > findMaxPrice () {
		
		return this.items
				.stream()
				.map( i -> i.getPrice() )
				.min( Comparator.reverseOrder () );
		
	}
	
	public List < ItemForStreamChallenge > findCheapestAndAvailable () {
		
		Optional < Integer > minPrice = this.items
				.stream()
				.filter( i -> i.getAvailable() == true)
				.map( i -> i.getPrice() )
				.min( Comparator.naturalOrder());
		
		List < ItemForStreamChallenge > cheap = this.items
				.stream()
				.filter( i ->  i.getPrice() == minPrice.get()  )
				.collect(Collectors.toList());
		
		System.out.println(cheap);
		
		return cheap;
		
				
	}
	
	public List < ItemForStreamChallenge > sortPricesMaxToMin ( ) {
		
		this.items
			.stream()
			.sorted()
			.collect(Collectors.toList())
			.forEach(System.out::println);
			
		 return this.items
				.stream()
				.sorted()
				.collect(Collectors.toList());
		 
	}
	
	public Optional < ItemForStreamChallenge > findById (Integer id) {
		
		Optional < ItemForStreamChallenge > itemForId = this.items
				.stream()
				.filter( i -> i.getId() == id )
				.findFirst();
		
		System.out.println(itemForId.get().getId());
		return itemForId;
	}
	
public Optional < ItemForStreamChallenge > findByName (String name) {
		
		Optional < ItemForStreamChallenge > itemForName = this.items
				.stream()
				.filter( i -> i.getName().equals( name ))
				.findAny();
		
		System.out.println(itemForName.get().getName());
		return itemForName;
	}
	

}
