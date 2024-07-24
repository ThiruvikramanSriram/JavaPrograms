package phase1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ch;
		double c;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number 1");
		a=obj.nextInt();
		System.out.println("enter number 2");
		b=obj.nextInt();
		System.out.println("enter your choice\n1.addition\n2.subtraction\n3.multiplication\n4.division");
		ch=obj.nextInt();
		switch(ch) {
		case 1:
			c=a+b;
			System.out.println("the result is"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("the result is"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("the result is"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("the result is"+c);
			break;
		default:
			System.out.println("enter only the operation in the menu");
				
		}
	}

}
