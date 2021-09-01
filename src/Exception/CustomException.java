package Exception;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
public class CustomException {
	
	static void valid(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("age is not valid");
		}
		else
		{
			System.out.println("welocme");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter age");
		int age=sc.nextInt();
		try {
			valid(age);
		}
		catch(InvalidAgeException ee)
		{
			System.out.println(ee);
		}
		System.out.println("executed done");
		
	}

}
