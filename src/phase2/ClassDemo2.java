package phase2;
import java.util.Scanner;


class Employee{
	int employeeno;
	String employeename;
	long salary;
	String position;
	
	void add(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int x,y;
		x=scanner.nextInt();
		y=scanner.nextInt();
		System.out.println(x+y); 	
	}
	void data(){
		System.out.println("employee no :"+employeeno);
		System.out.println("employee name :"+employeename);
		System.out.println("employee salary :"+salary);
		System.out.println("employee no :"+position);	
	}
}
public class ClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram=new Employee();
		ram.employeename="Ram";
		ram.employeeno=12312;
		ram.position="System Architecht";
		ram.salary=60000;
		ram.add();
		ram.data();
		
		

	}

}
