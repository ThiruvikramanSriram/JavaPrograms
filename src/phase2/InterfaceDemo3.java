package phase2;

public interface InterfaceDemo3 {
	int task1(int a);
	void task1();
	int task3(int c);
	
}

class interfaceDemo12 implements InterfaceDemo3{

	@Override
	public int task1(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public int task3(int c) {
		// TODO Auto-generated method stub
		return c+c;
		
	}

	@Override
	public void task1() {
		// TODO Auto-generated method stub
		
	}

	
	
}
