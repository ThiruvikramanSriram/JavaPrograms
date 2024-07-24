package Assignment2;

class Animal121{
	void makeSound() {
		System.out.println("hiiii");
	}
}
class Dog extends Animal121{
	void makeSound() {
		System.out.println("bow vow");
	}
}
class Cat extends Animal121{
	void makeSound() {
		System.out.println("meow meow");
	}
}


public class Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal121 a=new Animal121();
		a.makeSound();
		a=new Dog();
		a.makeSound();
		a=new Cat();
		a.makeSound();

	}

}
