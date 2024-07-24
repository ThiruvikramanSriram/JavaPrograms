package assignment1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number");
		int count=0,number=scanner.nextInt();
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				count=1;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}
		else
			System.out.println("not a prime number");

	}

}
