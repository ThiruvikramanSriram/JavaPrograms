package phase1;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		number=obj.nextInt();
		if(number%2==0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");

	}

}
