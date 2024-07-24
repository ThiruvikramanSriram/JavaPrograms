package Assignment2;

class Employee1{
	String name;
	int salary;
	
	int work(int a) {
		return a*a;
	}
}
class Manager extends Employee1{
	int work(int a) {
		return a+a;
	}
}
class Developer extends Manager{
	int work(int a) {
		return a/a;
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		System.out.println(e.work(35));
		Manager m=new Manager();
		System.out.println(m.work(35));
		Developer d=new Developer();
		System.out.println(d.work(35));

	}

}
