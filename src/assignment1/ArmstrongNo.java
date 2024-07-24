package assignment1;
import java.util.Scanner;


public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number to check armstrong or not");
		int number=scanner.nextInt();
		int sum=0;
		
		for(int i=number;i>0;){
			int j=i%10;
			sum=sum+(j*j*j);
			i=i/10;
		}
		
		System.out.println(sum);
		if(sum==number)
			System.out.println("the number is a armstrong number");
		else
			System.out.println("the number is not a armstrong number");

	}

}
