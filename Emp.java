import java.io.Serializable;
import java.io.*;

public class Emp implements Serializable{
	
	private String name;
	private int id;
	private String address;
	private transient double salary;
	
	public Emp() {
	}

	public Emp(String name, int id, String address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("name: " +name + " id: " +id + " address: " +address + " salary: " +salary);
	}
}