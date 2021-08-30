package Array;

import java.util.Scanner;

class Student
{
	private int id;
	private String name;
	private int percentage;
	public Student()
	{
		
	}
	public Student(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
}
public class CustomStudent {

	public static void main(String[] args) {
		Student[] studarr=new Student[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<studarr.length;i++)
		{
			System.out.println("enter id,name,percentage");
			int id=sc.nextInt();
			String nm=sc.next();
			int per=sc.nextInt();
			studarr[i]=new Student(id,nm,per);
		}
		System.out.println();
	}

}
