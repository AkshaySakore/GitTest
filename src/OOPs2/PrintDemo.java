package OOPs2;

public class PrintDemo {

	int n;
	char ch;
	public void form(int n,char ch)
	{
		System.out.println(n+" "+ch);
	}
	public void form(char ch,int n)
	{
		System.out.println(ch+" "+n);
	}
	public static void main(String[] args) {
		
		PrintDemo p1=new PrintDemo();
		p1.form(10,'A');
		p1.form('P', 20);
	}

}
