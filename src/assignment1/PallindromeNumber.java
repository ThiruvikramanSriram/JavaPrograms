package assignment1;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number");
		int number=scanner.nextInt();
		int r,pallindrome=0;
		
		for(int i=number;i>0;) {
			r=i%10;
			pallindrome=pallindrome*10+r;
			i=i/10;
		}
		System.out.println(pallindrome);
		if(number==pallindrome)
			System.out.println("yes the number is a pallindrome");
		else
			System.out.println("the number is not a pallindrome");
		

	}

}
