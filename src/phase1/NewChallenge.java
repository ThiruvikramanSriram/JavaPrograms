package phase1;
import java.util.Scanner;

public class NewChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=0;
		Scanner obj=new Scanner(System.in);
//		for(;;) {
//			System.out.println("enter any number");
//			number=obj.nextInt();
//			if(number>0) {
//				sum=sum+number;
//			}
//			else {
//				System.out.println("the sum is:" +sum);
//				break;
//			}
				
		System.out.println("enter any number");
		while((number=obj.nextInt())>0) {
			sum=sum+number;
	}
		System.out.println("the sum is ="+sum);

}
}
