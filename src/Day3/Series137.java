package Day3;

import java.util.Scanner;

public class Series137 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=0;
		System.out.println("enter the range");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			p=(p*2)+1;
			System.out.print(p+" ");
		}

	}

}
