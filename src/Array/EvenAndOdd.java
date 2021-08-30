package Array;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the "+arr.length+" of element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("even no is "+even);
		System.out.println("odd no is "+odd);
	}

}
