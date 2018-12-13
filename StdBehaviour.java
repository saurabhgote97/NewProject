import java.util.Scanner;
class Student
{

String name;
int age;
int id;
String branch;



void Identity()
{
Scanner Input = new Scanner(System.in);
System.out.println("Enter you name");
 String n =Input.nextLine();
System.out.println("Enter you age");
 int a =Input.nextInt();
System.out.println("Enter you Salary");
 float sal =Input.nextInt();
Input.nextLine();
System.out.println("Enter you PHONENUMBER");
 String ph =Input.nextLine();


System.out.println("your Name  "+n);
System.out.println("your age  "+a);
System.out.println("your salary "+sal);
System.out.println("your Ph no.  "+ph);

}
void goingCollege()
{
System.out.println("Going to college");
}
void studying()
{
System.out.println("Studying");
}
void goingHome()
{
System.out.println("Going to home");
}
}

class StdBehaviour{
public static void main(String args[])
{
System.out.println("Hello...I am saurabh");
Student Std1 = new Student();

Std1.Identity();
Std1.goingCollege();



}




}