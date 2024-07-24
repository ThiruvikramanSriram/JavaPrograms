package inheritence;

class Parent124124 {
	int a;
	
	Parent124124(){ //default constructor
	}
	Parent124124(int a){ //parameterized constructor
		this.a=a;
	}
	void print21() {
		System.out.println("parent "+a);
	}
}

class Child124124 extends Parent124124{
	int b;
	Child124124(){
	}
	Child124124(int b){
		super(b);
		this.b=b;
		
	}
	void print21() {
		super.print21();
		System.out.println("child"+b);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent124124 p=new Child124124(21);
		p.print21();
	}

}
