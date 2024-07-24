package assignment1;
import java.util.Scanner;


public class SumOfEvenRange3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter two numbers");
		number1=obj.nextInt();
		number2=obj.nextInt();
		int sum=0;
		for(int i=number1;i<=number2;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("the sum of even numbers between the range "+number1+" and "+number2+" is "+sum);

	}

}
