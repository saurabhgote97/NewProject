class Employee
{

int id;



void display()
{
System.out.println("");
}



Employee passObj(Employee e1)
{
System.out.println("Id in passing object " + e1.id);
e1.id = 500;
return e1;
}




}

class TestBH {

public static void main(String args[])
{
Employee Emp1 = new Employee();
Employee Emp2 = new Employee();
Employee Emp3 = new Employee();

Emp2.id=100;
Employee Emp4= Emp1.passObj(Emp2);
System.out.println("id is " + Emp4.id);




}




}