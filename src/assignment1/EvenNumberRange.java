package assignment1;

import java.util.Scanner;

public class EvenNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		number1 = obj.nextInt();
		number2 = obj.nextInt();
		for (int i = number1; i <= number2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
