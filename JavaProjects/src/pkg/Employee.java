package pkg;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
		System.out.println(address.zipcode);
	}

}
