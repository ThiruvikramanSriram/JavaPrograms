package phase1;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		int age;
		System.out.println("enter you age");
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		if (age >= 18)
			System.out.println("you are eligible to vote");
		else
			System.out.println("you are not eligible to vote, go and drink milk chinna payya");

	}

}
