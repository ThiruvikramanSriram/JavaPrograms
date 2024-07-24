package assignment1;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("eenter a number");
		int number=scanner.nextInt();
		int r=0,reverse=0;
		for(int i=number;i>0;) {
			r=i%10;
			reverse=reverse*10+r;
			i=i/10;
			System.out.println(r);
		}
		System.out.println(reverse);
	}

}
