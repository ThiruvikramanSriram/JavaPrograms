package phase1;
import java.util.Scanner;

public class SumOfCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		n=obj.nextInt();
		for(int i=0;i<=n;i++) {
			sum=sum+(i*i*i);
		}
		System.out.println("the sum of cubes is "+sum);

	}

}
