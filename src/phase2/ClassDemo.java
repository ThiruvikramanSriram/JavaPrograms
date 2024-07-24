package phase2;
import java.util.Scanner;

class Student{
	String name;
	int rollno;
	String dept;
	long mobileno;
	int marks;
	
	void read() {
		System.out.println("hii my name is "+name);
	}
	void grade() {
		if(marks>70)
			System.out.println("First class");
		else
			System.out.println("mame nee poota case uh");
	}
	
}



public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Student rollno1=new Student();
		Student rollno2;
		rollno2=new Student();
		
		rollno1.name="ABC";
		rollno1.dept="IT";
		rollno1.rollno=123;
		rollno1.mobileno=909090000000l;
		rollno1.marks=90;
		rollno1.read();
		rollno1.grade();
		System.out.println(rollno1.name);
		System.out.println(rollno1.dept);
		System.out.println(rollno1.rollno);
		System.out.println(rollno1.mobileno);
		System.out.println(rollno1.marks);
		System.out.println(rollno1);
	
		
		
		rollno2.name="ABd";
		rollno2.dept="dT";
		rollno2.rollno=1323;
		rollno2.mobileno=909090800000l;
		rollno2.marks=10;
		rollno2.read();
		rollno2.grade();
		

	}

}
