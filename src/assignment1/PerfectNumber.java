package assignment1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		int number = scanner.nextInt();
		int j=0;
		for (int i = 1; i<number; i++) {
			if (number % i == 0) {
				System.out.println("factorial of " +number +" is " + i);
				j = j + i;
			}

	}
		if(number==j) {
			System.out.println("its a perfect number");
		}
		else
			System.out.println("its not a perfect number");
	}
}
