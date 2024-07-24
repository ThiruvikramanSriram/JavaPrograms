package Assignment2;

class person1{
	private String name;
	private int age;
	private String address;
	
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	void setAddress(String Address ) {
		this.address=Address;
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getAddress() {
		return address;
	}
}

public class Assignment1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 p=new person1();
		p.setName("abcd");
		p.setAge(1);
		p.setAddress("1s street");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		
		
		

	}

}
