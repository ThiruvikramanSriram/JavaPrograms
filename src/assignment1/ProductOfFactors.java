package assignment1;

import java.util.Scanner;

public class ProductOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		int number = scanner.nextInt();
		long j=1l;
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("factors of " + " number is " + i);
				j = j * i;
			}

		}
		System.out.println("the product of factors is " + j);

	}
}
