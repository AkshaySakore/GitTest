package Loops;

public class HarshadNumber {

	public static void main(String[] args) {
		int num=156;
		int rem=0;
		int sum=0;
		int n;
		
		n=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(n%sum==0)
		{
			System.out.println("harshad number is"+n);
		}
		else
		{
			System.out.println("it is not harshad number"+n);
		}

	}

}
