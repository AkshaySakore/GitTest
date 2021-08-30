package Day3;

import java.util.Scanner;

public class WhileReverseOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=2;
		System.out.println("list of even number");
		while(i<=n)
		{
			System.out.println(i+" ");
			i=i+2;
		}

	}

}
