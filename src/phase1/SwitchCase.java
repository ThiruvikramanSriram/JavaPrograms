package phase1;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int number;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number to show the day");
		number=obj.nextInt();
		switch(number) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("enter only till 7 number");
		
		}

	}

}
