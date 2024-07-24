package Assignment2;

import java.util.Scanner;

class BankAccount12{
	private int accountno;
	private String accountname;
	private long balance=10000;
	
	void setaccountNo(int a) {
		this.accountno=a;
	}
	void setAccountName(String a) {
		this.accountname=a;
	}
	void setBalance(int a) {
		this.balance=a;
	}
	int getaccountNo() {
		return accountno;
	}
	String getaccountName() {
		return accountname;
	}
	long getBalance() {
		return balance;
	}
	
	long depositCash(long a) {
		this.balance=balance+a;
		return balance;
		
	}
	long withdrawCash(long a) {
		this.balance=balance-a;
		return balance;
	}
}

public class BankAccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount12 b1=new BankAccount12();
		b1.setAccountName("1am number");
		b1.setaccountNo(1211212);
		b1.setBalance(1000);
		System.out.println(b1.getaccountNo());
		System.out.println(b1.getaccountName());
		System.out.println(b1.getBalance());
		int c=1;
		Scanner scanner=new Scanner(System.in);
		while(c==1) {
			System.out.println("************\nenter your operation 1.deposit 2.withdraw\n*********");
			int a=scanner.nextInt();
			if(a==1) {
				System.out.println("enter amount");
				long amount=scanner.nextLong();
				b1.depositCash(amount);
			}
			else {
				System.out.println("enter amount ");
				long amount=scanner.nextLong();
				if(b1.getBalance()<=amount) {
					System.out.println("the transaction cannot proceed further..issufficient balance ");
				}
				else
				b1.withdrawCash(amount);
			}
			
			System.out.println("your updated balance: "+b1.getBalance());
			System.out.println("*****************\n Do you wish to continue 1/0 \n*****************");
			c=scanner.nextInt();
				
				
		}
		System.out.println("thank you banking with us");
		

	}

}
