package models;

public class Client {

	// attributes
	private String name;
	private String LastName;
	private String nid; //numero de identificacion
	private boolean hasChildren;

	// constructor
	public Client(String name, String LastName, String nid, boolean hasChildren) {
		this.name = name;
		this.LastName = LastName;
		this.nid = nid;
		this.hasChildren = hasChildren;
	}

	// methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getnid() {
		return nid;
	}

	public void nid(String nid) {
		this.nid = nid;
	}

	public boolean gethasChildren() {
		return hasChildren;
	}

	public void sethasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

}
