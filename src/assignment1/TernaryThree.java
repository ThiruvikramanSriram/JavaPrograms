package assignment1;
import java.util.Scanner;

public class TernaryThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter three numbers");
		num1=obj.nextInt();
		num2=obj.nextInt();
		num3=obj.nextInt();
		int largest=(num1>num2) ? ((num1>num3)?num1:num3):((num2>num3)?num2:num3);
		System.out.println("the largest of the three is "+largest);
	}

}
