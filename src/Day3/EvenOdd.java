package Day3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int  num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		switch(num%2)
		{
		case 0:
				System.out.println("even number is"+num);
				break;
		default :
				System.out.println("odd number is"+num);
		
		}

	}

}
