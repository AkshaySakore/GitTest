package OOPs1;

public class Student {
	
	int sid;
	String sname;
	int marks;
	
	void accept(int s,String sn,int n)
	{
		this.sid=s;
		this.sname=sn;
		this.marks=n;
	}
	void display() {
		System.out.println("student id"+sid);
		System.out.println("student name"+sname);
		System.out.println("student marks"+marks);
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.accept(101,"Akshay",89);
		s1.display();

	}

}
