package OOPs1;

public class Stud {
	int id;
	String name;
	void accept(int i,String n)
	{
		this.id=i;
		this.name=n;
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("name is"+name);
	}
	public static void main(String[] args) {
		Stud s=new Stud();
		s.accept(102, "abc");
		s.display();

	}

}
