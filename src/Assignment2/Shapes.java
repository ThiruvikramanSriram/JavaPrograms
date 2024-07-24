package Assignment2;

abstract class Shape{
	abstract void draw() ;
}
class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing a circle");
	}
	
}
class Square extends Circle{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing a Square");
	}
	
}


public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a=new Circle();
		a.draw();
		a=new Square();
		a.draw();
		

	}

}
