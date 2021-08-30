package OOPs2;

public class ThisKeyward {
	
	int rno;
	String name;
	int fee;
	ThisKeyward(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public ThisKeyward(int rno, String name, int fee) {
		this(rno,name);
		this.fee = fee;
	}
	void display()
	{
		System.out.println(rno+" roll no "+name+" name "+fee+" fee");
	}
	public static void main(String[] args) {
		
		ThisKeyward t=new ThisKeyward(101,"ABC");
		ThisKeyward t1=new ThisKeyward(102,"PQR"+10000);
		t.display();
		t1.display();

	}

}
