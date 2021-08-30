package Containment;

public class Person {
	
	int id;
	String name;
	Vehical v;
	public Person(int id, String name, Vehical v) {
		super();
		this.id = id;
		this.name = name;
		this.v = v;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", v=" + v + "]";
	}
	public static void main(String[] args) {
		
		Person p1=new Person(101, "ABC", new Vehical(1001, "Swift"));
		Person p2=new Person(102, "PQR", new Vehical(1002, "Wagonar"));
		System.out.println(p1);
		System.out.println(p2);
	}
	

}


class Vehical {
	int vid;
	String vname;
	public Vehical(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vehical [vid=" + vid + ", vname=" + vname + "]";
	}
}