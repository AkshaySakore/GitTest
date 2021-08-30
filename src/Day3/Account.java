package Day3;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		
		int currentbalance=20000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Option :-");
		System.out.println("enter 1 for withdraw\nenter 2 for deposie\nenter 3 for check balance\nenter 4 for loan ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				System.out.println("how much you want to withdraw");
				int amt=sc.nextInt();
				if(amt>currentbalance)
				{
					System.out.println("no sufficient balance");
				}
				else
				{
					currentbalance=currentbalance-amt;
					System.out.println(amt+" is withdraw and current balance is "+currentbalance);
				}
				break;
		case 2:
				System.out.println("how much you can deposite");
				int damt=sc.nextInt();
				currentbalance=currentbalance+damt;
				System.out.println(damt+" is deposited and current balance is "+currentbalance);
				break;
		case 3:
				System.out.println("your current balance is"+currentbalance);
		case 4:
				System.out.println("how much loan you want");
				int lamt=sc.nextInt();
				currentbalance=currentbalance+lamt;
				System.out.println(lamt+" is loan and current balance is "+currentbalance);
				break;
		default:
				System.out.println("does not match the case");
				break;
		}
	}

}
