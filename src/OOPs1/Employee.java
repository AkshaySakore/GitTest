package OOPs1;

public class Employee {
	int eid;
	String ename;
	Employee(int e,String en)
	{
		this.eid=e;
		this.ename=en;
	}
	Employee(Employee e)
	{
		eid=e.eid;
		ename=e.ename;
	}
	void display()
	{
		System.out.println(eid+" "+ename);
	}
	public static void main(String[] args) {
		Employee e1=new Employee(101,"ABC");
		Employee e2=new Employee(102,"DEF");
		e1.display();
		e2.display();
	}

}
