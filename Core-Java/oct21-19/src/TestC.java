
public class TestC {
	public static void main(String[] args) {
		Person p = new Person();
		Person.sleep();
		System.out.println("Person color "+Person.color);
		
		System.out.println("*****************************");
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "kunal";
		System.out.println("Person's age is "+p1.age);
		System.out.println("Person's name is "+p1.name);
		p1.color = "black";
		System.out.println("Person's color is "+p1.color);
		p1.sleep();
		System.out.println("######################################");
		Person p2 = new Person();
		p2.age = 25;
		p2.name = "sumit";
		System.out.println("Person's age is "+p2.age);
		System.out.println("Person's name is "+p2.name);
		
		
	}

}
