package phase1;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		int number=obj.nextInt();
		PrimeOrNot num=new PrimeOrNot();
		num.primeOrNot(number);
		
	}
	void primeOrNot(int x) {
		int count=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				count=1;
				break;
			}
		}
		if(count==1)
			System.out.println("the number is not a prime number");
		else
			System.out.println("the number is a prime number");
	}

}
