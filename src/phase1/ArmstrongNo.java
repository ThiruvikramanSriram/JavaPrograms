package phase1;
import java.util.Scanner;



public class ArmstrongNo {
	public static void main(String[] agrs) {
		int number,sum=0,a,rem;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		number=obj.nextInt();
		a=number;
		while(number>0) {
			rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		if(sum==a)
			System.out.println("armstrong number");
		else
			System.out.println("not an armstrong number");
	}
}
