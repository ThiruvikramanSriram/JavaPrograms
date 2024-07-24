package Interface;

class Emp1{
	static int a=1;
	Emp1(){
		a++;
	}
	void display() {
		System.out.println(a);
	}
}



public class StaticDemo {
	public static void main(String[] args) {
		Emp1 e=new Emp1();
		e.display();
		Emp1 e1=new Emp1();
		e1.display();
	}
	
	
}
