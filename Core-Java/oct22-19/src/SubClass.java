// compiler write default super statement in every class
//super keyword we can call super class variable
public class SubClass extends SuperClass {
	
	String s = "subclass variable";
	
	public SubClass() {
		
		super();
		System.out.println("sub class constructor");
	}
	
	void getSData() {
		
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("***********************");
		super.superclassMethod();
		superclassMethod();
	}

}
