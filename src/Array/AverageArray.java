package Array;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    double[] arr = new double[10];
	    System.out.print("Enter 10 double values: ");

	    int i = 0;
	    while (i < arr.length) {
	      arr[i] = sc.nextDouble();
	      i++;
	    }

	    System.out.println(average(arr));
	  }

	  public static int average(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	      sum += arr[i];
	    }
	    return sum / arr.length;
	  }

	  public static double average(double[] arr) {
	    double sum = 0;
		for (int i = 0; i < arr.length; i++) {
	      sum +=arr[i];
	    }
	    return sum / arr.length;

	}

}
