package ArrayListCollection;

import java.util.ArrayList;

public class SwapElementInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(55);
		list.add(90);
		list.add(38);
		list.add(41);
		list.add(25);
		list.add(87);
		list.add(54);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);	
				}
			}
		}
		for(Integer al:list)
		{
			System.out.println(al);
		}
	}

}
