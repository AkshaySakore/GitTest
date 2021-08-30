package Loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		int temp=0;
		for(int i=2;i<=num1;i++)
		{
			if(num1%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("it is prime number"+num1);
		}
		else
		{
			System.out.println("it is not prime number"+num1);
		}

	}

}
