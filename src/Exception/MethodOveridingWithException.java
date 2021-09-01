package Exception;

import java.io.IOException;

class Parent
{
	void m1() throws IOException
	{
		System.out.println("parent method");
	}
}
class Child extends Parent
{
	void m1() throws IOException
	{
		System.out.println("child method");
	}
}
class Parent1
{
	void m2()
	{
		System.out.println("parent method");
	}
}
class Child1 extends Parent1
{
	void m2() throws ArithmeticException
	{
		System.out.println("child method");
	}
}
public class MethodOveridingWithException {

	public static void main(String[] args) {

		Parent1 p=new Child1();
		p.m2();
	}

}
