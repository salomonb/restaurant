package models;

public class Product {
	
	//Attributes
	
	private String brand; //marca
	private String name;
	private int quantity;
	private double price;
	
	///constructor
	public Product(String name, String brand, int quantity,double price){
		this.brand=brand;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}


	
	///methods/ setters= fijar/getter = obtener
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
