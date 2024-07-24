package phase1;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=1;
		Scanner obj=new Scanner(System.in);
		number=obj.nextInt();
		for(int i=1;i<=number;i++) {
			sum=sum*(i);
			
		}
		System.out.println(sum);

	}

}
