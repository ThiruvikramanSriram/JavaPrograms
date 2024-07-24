package assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number");
		int factorial=1,number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("the factorial of the given number is "+factorial);
	}

}
