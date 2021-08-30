package OOPs2;

public class Student {
	
	String name;
	int age;
	String address;
	
	public void setInfo(String name,int age)
	{
		System.out.println(name+" "+age);
	}
	public void setInfo(String mane,int age,String address)
	{
		System.out.println(name+" "+age+" "+address);
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setInfo("Akshay", 22);
		s1.setInfo("Amol", 24, "pune");
	}

}
