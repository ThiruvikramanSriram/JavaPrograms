package phase1;
import java.util.Scanner;

public class GreatestOfThreeWith {

	public static void main(String[] args) {
		int a,b,c,greatest;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter value of a");
		a=obj.nextInt();
		System.out.println("enter value of b");
		b=obj.nextInt();
		System.out.println("enter value of c");
		c=obj.nextInt();
		
		greatest= (a>b?a:b)>c?b:c;
		System.out.println(greatest);
	}

}
