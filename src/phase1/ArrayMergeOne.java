package phase1;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayMergeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
//		int n,m;
//		System.out.println("enter no of elements for arr1");
//		n=obj.nextInt();
//		System.out.println("enter no of elements for arr2");
//		m=obj.nextInt();
		int[] arr1=new int[5];
		int arr2[]=new int[5];
		int[] arr3=new int[11];
		
		System.out.println("enter elements of arr1");
		for(int i=0;i<5;i++) {
			arr1[i]=obj.nextInt();
		}
		
		System.out.println("enter elements of arr2");
		for(int i=0;i<5;i++) {
			arr2[i]=obj.nextInt();
		}
		
		//joining 2 arrays , there is mistake in the logic
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<arr3.length;i++) {
			arr3[i]=arr2[j];
			j++;
		}
		
		System.out.println("the merged array is: ");
		//printing the merged array
		for(int i=0;i<11;i++) {
			System.out.println(arr3[i]);
		}
		

	}

}
