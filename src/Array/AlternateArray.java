package Array;

import java.util.Scanner;

public class AlternateArray {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		for(int i=0;i<=4;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<=4;i=i+2)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
