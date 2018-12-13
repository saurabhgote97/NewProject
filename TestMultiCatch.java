class TestMultiCatch
{

	public static void main(String args[])
	{
	int abc[] = {10,20,30,40,50};
	
	

	try{
	int res = abc[1]/Integer.parseInt(args[0]);
	System.out.println(res);
	}catch(ArithmeticException e){
	System.out.println(e.toString());

 	}catch(ArrayIndexOutOfBoundsException e){
	System.out.println(e.toString());
	
	}catch(NumberFormatException e){
	System.out.println(e.toString());
	}
	System.out.println("Bye...");
	System.out.println("Bye...");
	System.out.println("Bye...");
	}
}