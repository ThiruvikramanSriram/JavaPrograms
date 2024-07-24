package assignment1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		
		for(int i=number1;i>0;i--) {
			if(number1%i==0 && number2%i==0 && number3%i==0) {
				System.out.println("the GCD is "+i);
				break;
			}
		}
		

	}

}
