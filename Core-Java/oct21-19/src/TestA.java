
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "blue";
		p.brand = "blackdog";
		System.out.println("Cost is "+p.cost);
		System.out.println("Cost is "+p.color);
		System.out.println("Cost is "+p.brand);

		p.write();

		System.out.println("**************************************");
		Van v = new Van();
		v.cost = 500000;
		v.color = "Green";
		System.out.println("Van cost is "+v.cost);
		System.out.println("Van cost is "+v.color);
		v.move();
		
		Van v1 = new Van();
		v1.cost = 600000;
		v1.color = "Orange";
		System.out.println("Van v1 cost is "+v1.cost);
		System.out.println("Van v1 color is "+v1.color);
		v1.move();


	}

}