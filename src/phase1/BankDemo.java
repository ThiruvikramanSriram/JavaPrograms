package phase1;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opin, pin, deposit, balance, withdrawl, accno, op, cont;
		opin = 0000;
		balance = 50000;
		cont = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("hello,welcome to ABC bank");
		System.out.println("please enter you acc no");
		accno = obj.nextInt();
		System.out.println("enter pin");
		pin = obj.nextInt();
		if (pin == opin) {
			System.out.println("enter the operation to be performed\n1.checkbalance\n2.deposit\n3.withdrawl");
			op = obj.nextInt();
			switch (op) {
			case 1:
				System.out.println("your balance is :" + balance);
				break;
			case 2:
				System.out.println("enter amount to be deposited");
				deposit = obj.nextInt();
				if (deposit > 15000) {
					System.out.println("enter amount less than 15000");
				} else {
					balance = balance + deposit;
				}
				break;
			case 3:
				System.out.println("enter the amount for cash withdrawl");
				withdrawl = obj.nextInt();
				if (withdrawl > balance) {
					System.out.println("issufficient balance");
				} else {
					balance = balance - withdrawl;
				}
				break;
			default:
				System.out.println("thank you for visiting us");
			}

		} else {
			System.out.println("enter the correct pin");
		}
		System.out.println("-----------------------");
		System.out.println("account number: " + accno);
		System.out.println("current balance: " + balance);
		System.out.println("thank you for visiting us");
		System.out.println("-----------------------");

		System.out.println("do you want to continue - (0/1)");
		cont = obj.nextInt();
		while (cont == 1) {
			System.out.println("hello,welcome to ABC bank");
			System.out.println("please enter you acc no");
			accno = obj.nextInt();
			System.out.println("enter pin");
			pin = obj.nextInt();
			if (pin == opin) {
				System.out.println("enter the operation to be performed\n1.checkbalance\n2.deposit\n3.withdrawl");
				op = obj.nextInt();
				switch (op) {
				case 1:
					System.out.println("your balance is :" + balance);
					break;
				case 2:
					System.out.println("enter amount to be deposited");
					deposit = obj.nextInt();
					if (deposit > 15000) {
						System.out.println("enter amount less than 15000");
					} else {
						balance = balance + deposit;
					}
					break;
				case 3:
					System.out.println("enter the amount for cash withdrawl");
					withdrawl = obj.nextInt();
					if (withdrawl > balance) {
						System.out.println("issufficient balance");
					} else {
						balance = balance - withdrawl;
					}
					break;
				default:
					System.out.println("thank you for visiting us");
				}

			} else {
				System.out.println("enter the correct pin");
			}
			System.out.println("-----------------------");
			System.out.println("account number: " + accno);
			System.out.println("current balance: " + balance);
			System.out.println("thank you for visiting us");
			System.out.println("-----------------------");
			
			System.out.println("do you want to continue - (0/1)");
			cont = obj.nextInt();
		}

	}

}
