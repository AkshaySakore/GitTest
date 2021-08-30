package Containment;
class Institute1
{
	int id;
	String name;
	Branch1 b;
	public Institute1(int id, String name, Branch1 b) {
		super();
		this.id = id;
		this.name = name;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Institute1 [id=" + id + ", name=" + name + ", b=" + b + "]";
	}
	
}
class Branch1
{
	int id;
	String name;
	Subject1 s;
	public Branch1(int id, String name, Subject1 s) {
		super();
		this.id = id;
		this.name = name;
		this.s = s;
	}
	@Override
	public String toString() {
		return "Branch1 [id=" + id + ", name=" + name + ", s=" + s + "]";
	}
	
}
class Subject1
{
	int id;
	String name;
	Topic1 t;
	public Subject1(int id, String name, Topic1 t) {
		super();
		this.id = id;
		this.name = name;
		this.t = t;
	}
	@Override
	public String toString() {
		return "Subject1 [id=" + id + ", name=" + name + ", t=" + t + "]";
	}
	
}
class Topic1
{
	int id;
	String name;
	SubTopic1 st;
	public Topic1(int id, String name, SubTopic1 subTopic1) {
		super();
		this.id = id;
		this.name = name;
		this.st = subTopic1;
	}
	@Override
	public String toString() {
		return "Topic1 [id=" + id + ", name=" + name + ", st=" + st + "]";
	}
	
}
class SubTopic1
{
	int id;
	String name;
	Question1 q;
	public SubTopic1(int id, String name, Question1 q) {
		super();
		this.id = id;
		this.name = name;
		this.q = q;
	}
	@Override
	public String toString() {
		return "SubTopic1 [id=" + id + ", name=" + name + ", q=" + q + "]";
	}
	
}
class Question1
{
	int id;
	String name;
	public Question1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Question1 [id=" + id + ", name=" + name + "]";
	}
	
}
public class Containment2 {

	public static void main(String[] args) {
		
		Institute1 i1=new Institute1(1, "DYPATIL", new Branch1(11, "comp", new Subject1(21, "Java", new Topic1(31, "Containment", new SubTopic1(41,"Constructor",new Question1(51, "Institute"))))));

	}

}
