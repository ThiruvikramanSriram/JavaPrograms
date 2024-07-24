package phase2;



class Area{
	int area=10;
	
	void cal(int x) {
		area=x*x;
		System.out.println("teh area of square = "+area);
	}
	void cal(int x,int y) {
		area=x*y;
		System.out.println("rectange "+area);
	}
	void cal(int x,int y,int z) {
		area=x*y*z;
		System.out.println("cuboid "+area);
	}
	void cal() {
		System.out.println("hii" +area);
	}
	void cal(String x) {
		System.out.println(x);
	}
	
	
}

public class Polymorphismdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area s=new Area();
		s.cal(3);
		s.cal(3,4);
		s.cal(3,5,6);
		s.cal("abc");
		s.cal();
		
	}

}
