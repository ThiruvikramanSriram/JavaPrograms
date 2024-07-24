package phase2;

public class MyChild1 extends MyParent1 {
	int b;
	MyChild1(int x,int y){
		super(y);
		this.b=x;
		System.out.println("this is child class");
	}
}
