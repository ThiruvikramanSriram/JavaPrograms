package phase1;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<5;i++) {
			arr[i]=obj.nextInt();
			System.out.println("the entered number is: "+ arr[i]);
		}
		
		System.out.println("the entered numbers are:");
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
	}

}
