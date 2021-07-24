package models;

public class Recipe {
	
	//attributes
	private String name;
	private int price;
	
	//constructor
	public Recipe(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	//methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	
	
}
