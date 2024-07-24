package phase1;

public class Armstrong100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, up = 1, sum = 0, rem = 0;
		int arr[] = new int[100];
		for (number = 100; number < 1000; number++) {
			int a = number;
			int b=number;
			for (int i = 0; i < 3; i++) {
				rem = a % 10;
				sum = sum + (rem * rem * rem);
				a = a / 10;
				System.out.println(sum);
			}
			if (number == sum) {
				System.out.println("this is armstrong");
			}
			System.out.println("completed");

		}

	}

}
