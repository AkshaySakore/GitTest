package Array2D;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		
		int [][] arr=new int[3][3];
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
		int sum=0;
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		//digonal array
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				if(r==c)
				{
					System.out.println(arr[r][c]+" ");
				}
				//System.out.println();
			}
		}
	}
}