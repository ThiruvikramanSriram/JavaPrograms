package phase1;
import java.util.Scanner;

public class PersonsAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the age");
		age=obj.nextInt();
		if(age>=60)
			System.out.println("Senior");
		else if(20<age && age<=60)
			System.out.println("Adult");
		else if(age<20 && age>=12)
			System.out.println("Teenager");
		else
			System.out.println("child");
	}

}
