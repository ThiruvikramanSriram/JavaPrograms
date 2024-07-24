package assignment1;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number,count=0;
		number=scanner.nextInt();
		for(int i=number;i>0;i--) {
			count=count+1;
			i=i/10;
		}
System.out.println(count);
	}

}
