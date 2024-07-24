package phase2;

public interface InterfaceDemo {
	void task1();
	void task2();
	void task3();

}
abstract class InterfaceDemoImpl implements InterfaceDemo{

	@Override
	public void task1() {
		System.out.println("hii");
		
	}

	@Override
	public void task2() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
   abstract void task4();
	
}
class child1331 extends InterfaceDemoImpl{

	@Override
	public void task3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void task4() {
		// TODO Auto-generated method stub
		
	}
	
}




