package Interface;

class outer{
	void display() {
		System.out.println("hii");
	}
	 class inner {
		 
		void display2() {
			System.out.println("hello");
		}
	}
}

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer o=new outer();
		
		outer.inner i=o.new inner();
		i.display2();
		
	}

}
