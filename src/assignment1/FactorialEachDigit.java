package assignment1;

import java.util.Scanner;




public class FactorialEachDigit {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
		int j=1;
		FactorialEachDigit f=new FactorialEachDigit();
		
		for(int i=number;i>0;) {
			j=i%10;
			System.out.println("factorial of "+j+" is "+ f.Factorial12124(j));
			i=i/10;
		}
	}
	int Factorial12124(int x){
		int sum=1;
		for(int i=1;i<=x;i++) {
			sum=sum*i;	
		}
		return sum;
	}

}
