package Day3;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		int n,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(sum=0;n!=0;n=n/10)
		{
			sum=sum+n%10;
		}
		System.out.println("sum of digit "+sum);
	}

}
