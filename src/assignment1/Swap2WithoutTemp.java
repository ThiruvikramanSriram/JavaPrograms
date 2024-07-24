package assignment1;
import java.util.Scanner;

public class Swap2WithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value for a");
		a=obj.nextInt();
		System.out.println("enter the value for b");
		b=obj.nextInt();
		System.out.println("the value of a is :"+((a+b)-a));
		System.out.println("the value of b is :"+((a+b)-b));
		

	}

}
