package phase2;


class Abc{
	String name;
	String e1mail;
	
	Abc(String  name,String e1mail) {
		this.name=name;
		this.e1mail=e1mail;
	}
	Abc getter1() {
		return this;
	}
//	void getter1() {
//		System.out.println(e1mail); 
//	}
}


public class ClassFunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc s=new Abc("vikram","axom");
		
//		String S1=s.getter();
//		System.out.println(S1);
//		Abc x1=new Abc("a","s");
//		Abc x=s.getter1();
//		Abc x2=x1.getter1();
//		
//		System.out.println(x2.name +"    " + x2.e1mail);
		System.out.println(s.name +"    " + s.e1mail);
		
		

	}

}
