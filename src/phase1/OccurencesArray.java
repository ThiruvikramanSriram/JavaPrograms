package phase1;
import java.util.Scanner;


public class OccurencesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		int count=0;
		int number;
		//input
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the elemetns");
		for(int i=0;i<5;i++){
			arr[i]=obj.nextInt();
		}
		System.out.println("enter the number to know the count");
		number=obj.nextInt();
		//count
		for(int i=0;i<5;i++) {
			if(arr[i]==number)
				count++;
		}
		System.out.println("the number of times the element is in the array is :"+count);

	}

}
