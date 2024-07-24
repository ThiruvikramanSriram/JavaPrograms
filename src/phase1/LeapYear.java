package phase1;
import java.util.Scanner;


public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a year");
		year=obj.nextInt();
		if(year%4==0 && year%100!=0 ||year%400==0)
			System.out.println("it is a leap year");
		else
			System.out.println("it is not a leap year");
	}
}
