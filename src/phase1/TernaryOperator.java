package phase1;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		int a,b,max;
		Scanner c=new Scanner(System.in);
		System.out.println("enter a number a");
		a=c.nextInt();
		System.out.println("enter a number b");
		b=c.nextInt();
		max=a>b?a:b;
		System.out.println(max);

	}

}
