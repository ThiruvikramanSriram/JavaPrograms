package assignment1;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int number = scanner.nextInt();
		int j = 1;
		int sum2 = 0;
		StrongNumber f = new StrongNumber();

		for (int i = number; i > 0;) {
			j = i % 10;
			sum2 = sum2 + f.Factorial12124(j);
			i = i / 10;
		}
		if (number == sum2)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");

	}

	int Factorial12124(int x) {
		int sum = 1;
		for (int i = 1; i <= x; i++) {
			sum = sum * i;
		}
		return sum;
	}
}
