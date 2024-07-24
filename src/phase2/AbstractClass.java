package phase2;

abstract class Abs{
	void task1() {
		System.out.println("hii");
	}
	abstract void task2();
}

class Two extends Abs{

	@Override
	void task2() {
	System.out.println("hello");
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two t=new Two();
		t.task1();
		t.task2();

	}

}
