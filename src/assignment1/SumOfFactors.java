package assignment1;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		int j = 0, number = scanner.nextInt();
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("factors of " + " number is " + i);
				j = j + i;
			}

		}
		System.out.println("the sum of the factors is " + j);

	}
}