// non static block.....
public class TestB {
	static int b;
	int a;
	// non static block started.......
	{
		a = 10;
		b = 20;
		System.out.println("non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestB b = new TestB();
		TestB b1 = new TestB();
		System.out.println("main ended");
	}
	{
		System.out.println("non static block 2");
	}

}
