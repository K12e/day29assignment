package DesignPattern;

public class EmployeeRecord implements Prototype {
	private int id;
	private String name,designation;
	private double salary;
	private String Address;
	
	
	public EmployeeRecord() {
		System.out.println("Employee Records of Oracle Corporation");
		System.out.println("-------------------------------------------------");
		System.out.println("id\"+\"\\t\"+\"name\"+\"\\t\"+\"designation\"+\"\\t\"+\"salary\"+\"\\t\\t\"+\"address");
		
	}
	


	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.Address = address;
	}
	
	public void showRecord() {
		System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+Address);
	}


	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new EmployeeRecord(id,name,designation,salary,Address);
	}
	}


