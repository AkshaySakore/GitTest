package OOPs1;

public class Account {
	
	int acno;
	double bal;
	Account(int a,int b)
	{
		acno=a;
		bal=b;
	}
	public void withdraw(int w)
	{
		bal = bal-w;
	}
	public void deposite(int d)
	{
		bal = bal+d;
	}
	
	public static void main(String[] args) {
		Account a=new Account(101,1000);
		System.out.println("withdraw is");
		System.out.println("deposite is");

		
	}

}
