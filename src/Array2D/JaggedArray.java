package Array2D;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		int [][]a=new int[3][];
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]=new int[3];
		
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<a.length;r++)
		{
			System.out.println("enter"+a[r]+"element in row"+r);
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		for(int[] x:a)
		{
			for(int d:x)
			{
				System.out.print(d);
			}
			System.out.println();
		}
	}

}
