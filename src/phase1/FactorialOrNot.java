package phase1;
import java.util.Scanner;


public class FactorialOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		int number=obj.nextInt();
		
		FactorialOrNot f=new FactorialOrNot();
		int c=f.factorial(number);
		
		System.out.println("the factorial of the number is :"+c);
	}
	
	int factorial(int x){
		int sum=1;
		for(int i=1;i<=x;i++) {
			sum=sum*(i);
		}
		return sum;
		
	}

}
