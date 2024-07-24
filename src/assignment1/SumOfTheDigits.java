package assignment1;
import java.util.Scanner;


public class SumOfTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number");
		int number=scanner.nextInt();
		int t,sum=0;
		
		for(int i=number;i>0;) {
			t=i%10;
			sum=sum+t;
			i=i/10;
		}
		System.out.println("the sum of the individual digits of the entered number is "+sum);
		
		

	}

}