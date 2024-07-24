package assignment1;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any 2 number");
		int sum=0,number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int j=0;
			
		for(int i=number1;i<=number2;i++) {
			j=0;
			for(int k=2;k<i;k++) {
				if(i%k==0) {
					j=1;
					break;
				}
			}
//			System.out.println("Checking " + j + "  - " + i);
			if(j==0) {
				System.out.println(i);
				
			}
		}
	}
}
		
		

