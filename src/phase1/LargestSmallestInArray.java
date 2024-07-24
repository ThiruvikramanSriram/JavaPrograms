package phase1;
import java.util.Scanner;



public class LargestSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
		//input of elements
		int[] arr1=new int[5];
		System.out.println("enter the elements");
		for(int i=0;i<5;i++){
			arr1[i]=obj.nextInt();
		}
		int temp;
		//sort - largest and smallest;;;error with N
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(arr1[i]>arr1[j]) {
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		//display
		System.out.println("the smallest is = "+arr1[0]);
		System.out.println("the largest is ="+arr1[4]);
		

	}

}
