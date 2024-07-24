package phase1;

import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a");
		a=obj.nextInt();
		System.out.println("enter b");
		b=obj.nextInt();
		if(a>b)
			System.out.println("a is greater than b");
		else
			System.out.println("b is greater than a");

	}

}
