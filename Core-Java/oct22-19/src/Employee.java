// Assigning constructor to prevent creating n no. of objects..
public class Employee {
	String name;
	int eid;
	
	public Employee(String emname, int emid) {
		name = emname;
		eid = emid;
		
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("rabika", 143);
		e1.printDetails();
		Employee e2 = new Employee("manasi", 179);
		e2.printDetails();
		Employee e3 = new Employee("shruti", 106);
		e3.printDetails();
		
		
		
		
		

	}

}
