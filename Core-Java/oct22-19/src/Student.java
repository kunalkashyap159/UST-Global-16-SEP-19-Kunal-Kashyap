
public class Student {

		String name;
		String branch;
		int rollno;
		long mobno;
		int age;
		
		public Student(String name, String branch, int rollno, long mobno, int age) {
			this.name = name;
			this.branch = branch;
			this.rollno = rollno;
			this.mobno = mobno;
			this.age = age;
		}
		
		void displayDetails()
		{
			System.out.println("Name of the student "+name);
			System.out.println("Branch of the student "+branch);
			System.out.println("Rollno of the student "+rollno);
			System.out.println("Mobileno of the student "+mobno);
			System.out.println("Age of the student "+age);
		}
		
		public static void main(String[] args) {
			Student s1 = new Student("kunal","EEE",100,986430954,22);
			s1.displayDetails();
			Student s2 = new Student("sumit","civil",101,945430954,21);
			s2.displayDetails();
			Student s3 = new Student("mayank","EE",102,986430324,23);
			s3.displayDetails();
			Student s4 = new Student("kunal","CS",103,921430954,21);
			s4.displayDetails();
			Student s5 = new Student("nitish","IT",104,911430954,22);
			s5.displayDetails();
			Student s6 = new Student("aman","civil",105,900430954,21);
			s6.displayDetails();
			Student s7 = new Student("raj","EE",106,944430954,22);
			s6.displayDetails();
			Student s8 = new Student("rakesh","CS",107,911430954,20);
			s8.displayDetails();
			Student s9 = new Student("hari","IT",108,900430954,21);
			s9.displayDetails();
			Student s10 = new Student("kunal","EEE",109,988430954,22);
			s10.displayDetails();
		}

		
		

	}


