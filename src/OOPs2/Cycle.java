package OOPs2;

public class Cycle {
	int accountno;
	int noofWheels;
	
	public Cycle()
	{
		this(100,1);
		System.out.println("i am in default constructor");
	}
	public Cycle(int accountno, int noofWheels) {
		System.out.println(" i am in parameterized constructor");
		this.accountno = accountno;
		this.noofWheels = noofWheels;
	}
	public void getCycle()
	{
		System.out.println("1st method");
	}
	public void getCycle2()
	{
		this.getCycle();
		System.out.println("2nd method");
	}
	
	public static void main(String[] args) {
	
		Cycle c1=new Cycle();
		Cycle c2=new Cycle(100,12);
		c2.getCycle2();
				
	}

}