package Day1;

import java.util.Scanner;

public class NumberAdd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int number=sc.nextInt();
	    System.out.println("Digit    Frequency");
	    for(int i=0;i<=9;i++)
	     {
	       int count=0;
	       int temp=number;
	       while(temp>0)
	          {
	             int digit=temp%10;
	             if(digit==i)
	                {
	                   count++;
	                }
	              temp=temp/10;
	           }
	            if(count>0)
	            {
	                System.out.println(i+"     "+count);
	            }
	     }
	}

}
