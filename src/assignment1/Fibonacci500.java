package assignment1;

import java.util.Scanner;

public class Fibonacci500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[] number=new int[18];
		number[0]=0;
		number[1]=1;
		System.out.println(number[0]);
		System.out.println(number[1]);
		for(int i=2;i<=number.length-1;i++) {
			number[i]=number[i-1]+number[i-2];
			if(number[i]>=500 && number[i]<=2000)
				System.out.println(number[i]);
		}

	}

	}

