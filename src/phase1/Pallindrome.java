package phase1;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scanner.next();
		StringBuffer stringbuffer=new StringBuffer(str);
		String Reverse=stringbuffer.reverse().toString();
		if((str.toLowerCase()).equals(Reverse.toLowerCase()))
			System.out.println("pallindrome");
		else
			System.out.println("not a pallindrome");

	}

}
