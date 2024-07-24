package phase1;

import java.util.Scanner;

public class TargetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, count = 0, x = 0;
		int[] arr = new int[5];
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = obj.nextInt();
		}
		System.out.println("enter element to be found");
		number = obj.nextInt();

		for (int i = 0; i < 5; i++) {
			if (arr[i] == number) {
				count = 1;
				System.out.println("the num is found");
				x = arr[i];
				break;
			} else
				count = 2;

		}
		if (count == 1) 
			System.out.println("the number is found in the position : "+x);
		else if(count==2)
			System.out.println("the number is not found in the list");

	}

}
