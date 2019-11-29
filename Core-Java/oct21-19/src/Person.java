
public class Person {
	String name;
	static String color;
	int age;


	void eat()
	{
		System.out.println("Person eat() method");
	}
	void walk()
	{
		System.out.println("Person walk() method");
	}
	static void sleep()
	{
		System.out.println("Person sleep() method");
	}

}

// static variable or static method we can access directly without creating object.
// by using class name . operator