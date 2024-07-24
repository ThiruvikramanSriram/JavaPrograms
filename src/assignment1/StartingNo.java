package assignment1;
import java.util.Scanner;


public class StartingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number");
		int number=scanner.nextInt();
		int t,r=0;
		for(int i=number;i>10;) {
			t=i%10;
			i=i/10;
			r=i;
			System.out.println(r);
		}
		if(r%2==0)
			System.out.println("the starting digit is even");
		else
			System.out.println("the starting digit is odd");
	}

}
