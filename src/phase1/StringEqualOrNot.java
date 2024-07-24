package phase1;
import java.util.Scanner;

public class StringEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a string");
		
		String a=obj.next();
		StringBuilder S=new StringBuilder(a);
		StringBuilder s=new StringBuilder(S);
		StringBuilder S1=new StringBuilder(s.reverse());
		String S2=S1.toString();
		System.out.println(S2);
		
		
		if(a.equals(S2))
			System.out.println("Pallindrome");
		else
			System.out.println("they are not pallindrome");
			
		

	}

}
