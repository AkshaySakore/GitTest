package OOPs1;

public class Arithmetic {
	int n1;
	int n2;
	int add(int n1,int n2)
	{
		return n1+n2;
	}
	int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	int add(int n1,int n2,int n3,int n4)
	{
		return n1+n2+n3+n4;
	}


	public static void main(String[] args) {
		Arithmetic a=new Arithmetic();
		System.out.println("sum of two number"+a.add(10, 20));
		System.out.println("sum of three number"+a.add(10, 20, 30));
		System.out.println("sum of four number"+a.add(10, 20, 30, 40));

	}

}
