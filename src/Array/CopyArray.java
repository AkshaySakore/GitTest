package Array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] arr1=new int[] {25,14,56,15,56,77,18,29,49};
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("original array is ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" ");
			
		}
		System.out.println();
		System.out.println("new array is");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]+" ");
			
		}
	}

}
