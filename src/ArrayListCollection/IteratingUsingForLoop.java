package ArrayListCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingUsingForLoop {

	public static void main(String[] args) {
		

		ArrayList<String>al=new ArrayList<>();
		System.out.println(al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");
		al.add("J");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Iterator<String>i=al.iterator();
		while(i.hasNext())
		{
			String data=i.next();
			System.out.println(data);
		}
			

	}

}