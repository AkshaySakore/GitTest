package ArrayListCollection;

import java.util.ArrayList;

public class NonGenericArrayList {

	public static void main(String[] args) {

		ArrayList<Integer>al1=new ArrayList();
		al1.add(51);
		al1.add(65);
		al1.add(97);
		al1.add(12);
		al1.add(29);
		
		System.out.println(al1);
		
		ArrayList<String>al2=new ArrayList();
		al2.add("A");
		al2.add("B");
		al2.add("C");
		al2.add("D");
		al2.add("E");
		
		System.out.println(al2);
	}

}
