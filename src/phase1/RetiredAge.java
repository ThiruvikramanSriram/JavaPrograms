package phase1;
import java.util.Scanner;

public class RetiredAge {

	public static void main(String[] args) {
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter age");
		age=obj.nextInt();
		
		if(age>=60)
			System.out.println("you are a boomer");
		else
			System.out.println("you are a young boomer");

	}

}
