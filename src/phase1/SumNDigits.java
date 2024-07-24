package phase1;
import java.util.Scanner;
public class SumNDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,rem,sum=0,a=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter any number to know the sum of their digits");
		number=obj.nextInt();
		a=number;
		while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("the sum for " +a+ " is "+sum);

	}

}

