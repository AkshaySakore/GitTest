package OOPs1;

public class Calculator {
	
	int a;
	int b;
	
	Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	int multiply()
	{
		return a*b;
	}
	float division()
	{
		return a/b;
	}
	static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial"+fact);
		return fact;
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator(30,20);
		c.add();
		System.out.println("multiplication"+c.multiply());
		System.out.println("division"+c.division());
		Calculator.fact(5);
	}

}
