package Day3;

public class Divisible2or3 {

	public static void main(String[] args) {
		int n=30;
		for(int num=0;num<n;num++)
		{
			if(num%2==0 && num%3==0)
				System.out.println(num+" ");
		}
		System.out.println(n);
	}

}
