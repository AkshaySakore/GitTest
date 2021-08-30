package Array;

public class NegativeelementArray {

	public static void main(String[] args) {
		int i = 0;
		int[] arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
		System.out.println("List of Negative Numbers in negative array ");
		while(i < arr.length) 
		{
			if(arr[i] < 0) {
				System.out.println(arr[i]+" ");
			}
			i++;
		}

	}

}
