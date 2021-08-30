package OOPs1;

public class Emp {
	
	int id;
	String name;
	int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public static void main(String[] args) {
		Emp e=new Emp();
		e.setId(101);
		e.setName("ABC");
		e.setSal(10000);
		
		System.out.println("emp id is "+e.getId()+" emp name is "+e.getName()+" emp salary is "+e.getSal());
	}

}
