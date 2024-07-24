package assignment1;
import java.util.Scanner;


public class SumOfOddNumberRange4 {
	public static void main(String[] args) {
		int number1;
		int number2;
		System.out.println("enter two numbers");
		Scanner obj=new Scanner(System.in);
		number1=obj.nextInt();
		number2=obj.nextInt();
		int sum=0;
		for(int i=number1;i<=number2;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println("the sum of odd numbers between the range "+number1+" and "+number2+" is "+sum);

	}
}
