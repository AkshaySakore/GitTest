package Array;

public class AverageArray1 {

	public static void main(String[] args) {
		 double[] arr={19, 12, 16, 200, 13};
	        double total=0;

	        for(int i=0;i<arr.length;i++){
	        	total=total+arr[i];
	        }
	        double avg=total/arr.length;
	        System.out.format("The average is: ",avg);

	}

}
