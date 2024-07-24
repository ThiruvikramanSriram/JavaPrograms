package assignment1;
import java.util.Scanner;


public class FibonacciNumber1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[] number=new int[10];
		number[0]=0;
		number[1]=1;
		System.out.println(number[0]);
		System.out.println(number[1]);
		for(int i=2;i<=number.length-1;i++) {
			number[i]=number[i-1]+number[i-2];
				System.out.println(number[i]);
		}

	}

}
