package OOPs2;

public class Area {
	
	int length,breadth;
	
	public void area(int sq)
	{
		int square=sq*sq;
		System.out.println(square);
	}
	public void area(int length,int breadth)
	{
		int rect=length*breadth;
		System.out.println(rect);
	}

	public static void main(String[] args) {
		Area a1=new Area();
		a1.area(2);
		a1.area(10, 20);

	}

}
