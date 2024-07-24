package phase1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]=new int[5];
//		Arrays.fill(arr,18);
//		
//		int arr1[]=new int[arr.length];
//		arr1=Arrays.copyOf(arr1, 3);
//		
//		arr1=Arrays.copyOfRange(arr, 2, 4);
//		int sum=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			sum=sum + arr[i];
//			
//		}
//		System.out.println("sum is "+sum);
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
		
		int arr2[]=new int[50];
		Scanner obj=new Scanner(System.in);
		int number;
		System.out.println("enter the size of array");
		number=obj.nextInt();
		for(int i=0;i<number;i++) {
			arr2[i]=obj.nextInt();
		}
		int oddsum=0,evensum=0;
		for(int i=0;i<number;i++) {
			if(i%2==1) {
				evensum=evensum+arr2[i];
			}
			else
				oddsum=oddsum+arr2[i];
		}
		System.out.println("the odd sum is: "+oddsum);
		System.out.println("the even sum is: "+evensum);
		
		
		
		
		

	}

}
