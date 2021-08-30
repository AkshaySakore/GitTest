package Day1;
import java.util.Scanner;

public class SwapWithThird {

	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("before swap "+x+"  "+y);
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swap "+x+"  "+y);
	}

}
