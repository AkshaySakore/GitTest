package Containment;

class Institute 
{
	int id;
	String name;
	Branch b;
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
	public Branch getB() {
		return b;
	}
	public void setB(Branch b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", b=" + b + "]";
	}
	
}
class Branch
{
	int id;
	String name;
	Subject sub;
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
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", sub=" + sub + "]";
	}
	
}
class Subject
{
	int id;
	String name;
	Topic t;
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
	public Topic getT() {
		return t;
	}
	public void setT(Topic t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", t=" + t + "]";
	}
	
}
class Topic
{
	int id;
	String name;
	SubTopic st;
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
	public SubTopic getSt() {
		return st;
	}
	public void setSt(SubTopic st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", st=" + st + "]";
	}
	
}
class SubTopic
{
	int id;
	String name;
	Question q;
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
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	@Override
	public String toString() {
		return "SubTopic [id=" + id + ", name=" + name + ", q=" + q + "]";
	}
	
}
class Question
{
	int id;
	String name;
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
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + "]";
	}
	
}
public class Containment1 {

	public static void main(String[] args) {
		Institute i1=new Institute();
		i1.setId(1);
		i1.setName("D y patil");
		
		Branch b1=new Branch();
		b1.setId(11);
		b1.setName("comp");
		
		Subject s1=new Subject();
		s1.setId(21);
		s1.setName("java");
		
		Topic t1=new Topic();
		t1.setId(31);
		t1.setName("containment");
		
		SubTopic st1=new SubTopic();
		st1.setId(41);
		st1.setName("gettersetter");
		
		Question q1=new Question();
		q1.setId(51);
		q1.setName("Institute program");
		
		i1.setB(b1);
		b1.setSub(s1);
		s1.setT(t1);
		t1.setSt(st1);
		st1.setQ(q1);
		System.out.println(i1);
		
		

	}

}
