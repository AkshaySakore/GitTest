package Array2D;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int [][] arr=new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<arr.length;r++)
		{
			System.out.println("enter element for row"+r);
			for(int c=0;c<arr[r].length;c++)
			{
				arr[r][c]=sc.nextInt();
			}
		}
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}

}
