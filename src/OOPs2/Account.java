package OOPs2;

public class Account {
	
	long accountno;
	String customername;
	
	Account()
	{
		System.out.println("i am in default constructor");
	}
	
	public Account(long accountno, String customername) {
		this.accountno = accountno;
		this.customername = customername;
		System.out.println("i am in parameterized constructor");
	}



	public static void main(String[] args) {
		
		Account a1=new Account();
		Account a2=new Account(563355669,"ABC");
		Account a3=new Account(968865645,"PQR");
		
		
	}

}
