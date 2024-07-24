package assignment1;
import java.util.Scanner;

public class Swapping2Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number for a:");
		a=obj.nextInt();
		System.out.println("enter number for b:");
		b=obj.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping, value of A="+a);
		System.out.println("after swapping, value of B="+b);
		
		

	}

}
