package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("enter the number");
		int a=sc.nextInt();
		}
		catch(NullPointerException e)
		{
			System.out.println("wrong input");
		}
		catch(InputMismatchException e)
		{
			System.out.println("wrong data");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
		Exception ee=new ArrayIndexOutOfBoundsException();
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
	}

}
