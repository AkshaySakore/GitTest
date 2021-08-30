package OOPs1;

public class Acc {
	
	long accno;
	String cname;
	Acc()
	{
		System.out.println("i am in deafault constructor");
	}
	Acc(long a,String cn)
	{
		System.out.println("i am in parameterized constructor");
	}

	public static void main(String[] args) {
		Acc a=new Acc(2589756,"Abc");
		

	}

}
