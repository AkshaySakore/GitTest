package Day3;

import java.util.Scanner;

public class WhileEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{
			if(i%2==0)
			{
				System.out.println("even no"+n);
			}
			else
			{
				System.out.println("odd no "+n);
			}
			i++;
		}
	}

}
