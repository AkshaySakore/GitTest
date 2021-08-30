package Array;

import java.util.Scanner;

public class NewArray1 {

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
			System.out.println(arr[i]);
		}
		for(int i=4;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		String[] name=new String[5];
		System.out.println("enter the name");
		for(int i=0;i<=4;i++)
		{
			name[i]=sc.next();
		}
		for(int i=0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
	}

}
