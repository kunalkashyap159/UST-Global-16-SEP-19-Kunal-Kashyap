package java.ustglobal.immutable;

public class MyString {
	
	private final int rollno;  // rule-1 make variable as private and final (immutable)
	private final String name;
	
	public MyString (int rollno, String name) {    // rule-2  create constructor (immutable)
		
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollNo() {    //  rule-3  only gets method (immutable)
		return rollno;
	}
	public String getName() {
		return name;
	}
	
	public MyString changeContent(int rollno, String name) {
		MyString m = new MyString(rollno, name);  //  rule-4  create object (immutable)
		return m;
	}

}
