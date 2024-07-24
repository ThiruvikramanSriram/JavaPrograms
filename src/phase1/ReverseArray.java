package phase1;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[5];
		int[] arr2=new int[5];
		Scanner obj=new Scanner(System.in);
		//input
		System.out.println("enter the elements that are to be reversed");
		for(int i=0;i<5;i++) {
			arr1[i]=obj.nextInt();
		}
		//reverse
		int j=4;
		for(int i=0;i<5;i++) {
			arr2[i]=arr1[j];
			j--;
		}
		//display
		for(int i=arr1.length;i<5;i++) {
			System.out.println(arr2[i]);
		}
	}

}
