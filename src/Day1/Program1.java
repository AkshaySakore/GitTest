package Day1;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three number");
		int num1=sc.nextInt();
		byte num2=sc.nextByte();
		short num3=sc.nextShort();
		System.out.println("Addition is = "+(num1+num2+num3));
		
		System.out.println("enter height");
		float ht=sc.nextFloat();
		System.out.println("height is = "+ht);
		
		System.out.println("enter mobile no");
		long mb=sc.nextLong();
		System.out.println("mobile no is = "+mb);
		
		System.out.println("enter boolean");
		boolean b=sc.nextBoolean();
		System.out.println("boolean is = "+b);
		
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("name is = "+nm);
		
		System.out.println("enter gender M/F");
		char c=sc.next().charAt(0);
		System.out.println("gender is = "+c);
		
		float f=8.5f;
		short s=(short)f;
		System.out.println(s);

	}

}
