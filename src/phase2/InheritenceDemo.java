package phase2;

class parent1{
	String name;
	
	void setParentName(String name){
		this.name=name;
	}
	void getParentName() {
		System.out.println("parent name is "+this.name);
	}
	
}

class child1 extends parent1{
	String name;
	int age;
	
	void setChildName(String name,int age){
		this.name=name;
		this.age=age;
	}
	void getChildName() {
		System.out.println("child name is "+this.name+this.age);
	}
}




public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c1=new child1();
		c1.setParentName("abc");
		c1.getParentName();
		c1.setChildName("asa", 5);
		c1.getChildName();
		
		parent1 p1=new parent1();
		p1.setParentName("as");
		p1.getParentName();
		
	}

}
