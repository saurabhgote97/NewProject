class A
{
	void display1()
	{
	System.out.println("A class method");
	}

}


class B extends A 
{

	void display2()		
	{

	System.out.println("B class method");

	}


}

class TestBHO
{
	public static void main(String args[])
	{
	A obj1 =new A();
	B obj2 =new B();
	obj1.display1();
	obj2.display2();
	obj1.display1();
	}




}

