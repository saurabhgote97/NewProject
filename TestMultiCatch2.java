class abc
{
void dis()
{
System.out.println("Abc method");

}

}


class TestMultiCatch2
{

	public static void main(String args[])
	{
	int abc[] = {10,20,30,40,50};
	abc obj = new abc();	
	
	try{
	int res = abc[1]/Integer.parseInt(args[0]);
	System.out.println(res);
	obj.dis();
	obj = null;
	obj.dis();
	}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
	System.out.println(e.toString());

 	}catch(NumberFormatException e){
	System.out.println(e.toString());
	
	}catch(Exception e){
	System.out.println("Generic Generated  " + e.toString());
	}
	System.out.println("Bye...");
	System.out.println("Bye...");
	System.out.println("Bye...");
	}
}