package models;

public class Table {
	
	//attributes
	private String number;
	private int ability; //ability=capacidad
	private int location;
	
	//constructor
	public Table(String number, int ability, int location){
		this.number=number;
		this.ability=ability;
		this.location=location;
	}
	
	//methods
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number=number;
	}
	
	public int getAbility() {
		return ability;
	}
	
	public void setAbility(int ability) {
		this.ability=ability;
	}
	
	public int getLocation() {
		return location;
	}
	
	public void setLocation(int location) {
		this.location=location;
	}
	

}
