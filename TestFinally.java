class TestFinally
{

	public static void main(String args[])
	{
	try{
	int res = 10/1;
	}catch(Exception e){
	System.out.println("Catch block");

 	}finally{
	System.out.println("Finally block");
	}
	System.out.println("Normal statement");
	System.out.println("Bye...");
	System.out.println("Bye...");
	}
}