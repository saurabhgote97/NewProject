import java.util.Scanner;

class Employee
{
	private String name;
	private int id;
	Scanner Input = new Scanner(System.in);
		Employee()
		{ 
			System.out.println("Constructor Message");



		}
		Employee(int id,String name)
		{

			this.id=id;
			this.name=name; 
			System.out.println("Constructor Message");



		}-
		public void setValues(int id,String name)
		{
			this.id=id;
			this.name=name;

		}


	void read()
	{
		
		System.out.println("Enter you name");
  		name =Input.nextLine();
		System.out.println("Enter you id");
  		id =Input.nextInt();
		
	}

	
	void display()
	{
		System.out.println("your Name  "+name+"your id  "+id);
	}
}

class EmpBehaviour
{
	public static void main(String args[])
	{	
		
                Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee(2,"Raj");
		emp1.display();
		emp2.display();
		emp3.display();


}
}
