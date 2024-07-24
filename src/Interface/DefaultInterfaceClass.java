package Interface;

interface DefaultInterface{
	void task1();
	default void task2() {
		System.out.println("default methods");
	};
}
class impl implements DefaultInterface{

	@Override
	public void task1() {
		// TODO Auto-generated method stub
		System.out.println("this is task 1");
		
	}
}

public class DefaultInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		impl i=new impl();
		i.task1();
		i.task2();
		
	}

}
