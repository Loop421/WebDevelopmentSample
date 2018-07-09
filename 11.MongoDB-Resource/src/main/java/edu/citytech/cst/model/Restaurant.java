package edu.citytech.cst.model;

public class Restaurant {
	
	public final String simpleId;
	public final String name;
	public final String cuisine;
	public final String borough;
	public final String zipcode;
	
	public Restaurant(String simpleId, String name, String cuisine, String borough, String zipcode) {
		super();
		this.simpleId = simpleId;
		this.name = name;
		this.cuisine = cuisine;
		this.borough = borough;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Restaurant [simpleId=" + simpleId + ", name=" + name + ", cuisine=" + cuisine + ", borough=" + borough
				+ ", zipcode=" + zipcode + "]";
	}
	
	
	
	

}
