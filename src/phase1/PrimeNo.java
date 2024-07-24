package phase1;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,a=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		number=obj.nextInt();
		for(int i=2;i<=number-1;i++) {
			if(number%i==0) {
				a=0;
				break;
			}
		}
		if(a==1)
			System.out.println("it is a prime no");
		else
			System.out.println("it is not a prime number");

	}

}
