package Day1;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal");
		int p=sc.nextInt();
		System.out.println("enter the interest");
		int r=sc.nextInt();
		System.out.println("enter the time ");
		int t=sc.nextInt();
		
		float si=(p*r*t)/100;
		System.out.println("simple interest "+si);

	}

}
