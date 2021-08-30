package Day3;

import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int max=0;
		for(int i=0;i<5;i++)
		{
			int n=sc.nextInt();
			if(max < n)
			{
				max=n;
			}
			System.out.println("max number "+max);
		}
		

	}

}
