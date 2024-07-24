package phase1;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		double units,amount,hundreds,modulus,a,b,c,d;
		amount=0;
		
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no of units");
		units=obj.nextDouble();
		if(units<100)
			amount=units*.5;
		else if(units<200)
			amount=50 +((units%100)*0.75);
		else if(units<300)
			amount=50+75+((units%100)*1.20);
		else
			amount=50+75+120+((units-300)*1.5);
		
			System.out.println("amount is "+amount);
		
		

	}

}
