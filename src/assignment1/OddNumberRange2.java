package assignment1;
import java.util.Scanner;

public class OddNumberRange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter two numbers");
		number1=obj.nextInt();
		number2=obj.nextInt();
		for(int i=number1;i<=number2;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

}
