class TestExcep
{

	public static void main(String args[])
	{
	int a = 10;
	int abc[] = {10,20,30,40,50};
	
	try{
	int sum = abc[7]/a;
	System.out.println("result" + sum);
	
	}catch(Exception e){
	System.out.println(e.toString());

	}
 

	System.out.println("Bye...");
	}
}