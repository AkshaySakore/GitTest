package Containment;

abstract class Teacher {
	int tid;
	String tname;
	long mono;
	public Teacher(int tid, String tname, long mono) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.mono = mono;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", mono=" + mono + "]";
	}
	abstract void salary();

}
class HourlyBased extends Teacher
{
	int rate_per_hours;
	int hrs;
	public HourlyBased(int tid, String tname, long mono, int rate_per_hours, int hrs) {
		super(tid, tname, mono);
		this.rate_per_hours = rate_per_hours;
		this.hrs = hrs;
	}
	@Override
	void salary() {
		System.out.println("in hoursbased salary method");
		
	}
	
}
class SalaryBased extends Teacher
{
	int  sal;
	public SalaryBased(int tid, String tname, long mono, int rate_per_hours, int sal)
	{
		super(tid,tname,mono);
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "SalaryBased [sal=" + sal + "]";
	}
	void salary()
	{
		System.out.println("salarybased salary method");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Teacher t1=new HourlyBased(101,"prof.gupta",798736833l,8,9);
		System.out.println(t1);
		t1.salary();
		System.out.println("--------------------------------");
		Teacher t2=new SalaryBased(102,"prof.kale",986453343l,8,50000);
		System.out.println(t2);
		t2.salary();

	}

}
