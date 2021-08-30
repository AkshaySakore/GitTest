package Day3;

public class WhileFibonacci {

	public static void main(String[] args) {
		int c=7,n=0,n1=1;
		System.out.println("fibonacci series of"+c+" numbers.");
		int i=1;
		while(i<=c)
		{
			System.out.println(n+" ");
			int sum=n+n1;
			n=n1;
			n1=sum;
			i++;
		}

	}

}
