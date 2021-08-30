package Day2;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1 and number 2");
		  double a= in.nextDouble();
		  double b=in.nextDouble();
		  System.out.println("Enter number operation to do");
		  double c = 0;
		  int ope= in.nextInt();
		  if(ope==0) {
			  c=a+b;
		  }
		  else if(ope==1) {
			  c=a-b;
		  }
		  else if(ope==2) {
			  c=a*b;
		  }
		  else if(ope==3) {
			  c=a/b;
		  }
		  else if(ope==4) {
			  c=a%b;
		  }
		  else {
			  System.out.println("invalid symbol so incorrect output");
		  }
		  System.out.println("The " +ope +" of " +a +" " +b +" is " +c);

	}

}
