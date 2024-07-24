package phase1;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		int number;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a number");
		number=a.nextInt();
		if(number==0)
			System.out.println("entered number is 0");
		else {
			if(number>0)
				System.out.println("the number is positive");
			else
				System.out.println("the number is negative");
		}

	}

}
