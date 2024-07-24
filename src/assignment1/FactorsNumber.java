package assignment1;

import java.util.Scanner;

public class FactorsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		int j = 0, number = scanner.nextInt();
		int[] arr = new int[100];
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("factorial of " + " number is " + i);
				arr[j] = i;
				j++;
			}

		}
		System.out.println("the factors are");
		for (int i = 0; i < 100; i++) {
			System.out.println(arr[i]);
			if(arr[i]==0)
				break;
		}
	}
}
