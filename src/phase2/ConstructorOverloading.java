package phase2;

class Person{
	String name;
	int no;
	
	Person(){
		System.out.println("default constructor");
	}
	Person(String name,int no){
		System.out.println("parametrized constructor");
		this.name=name;
		this.no=no;
	}
	void print() {
		System.out.println("name "+this.name+this.no);
	}
}




public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s1=new Person();
		s1.print();
		System.out.println("------------------");
		Person s2=new Person("aa",12);
		s2.print();

	}

}
