class Account {
	int accno;
	String name;
	float amount;
}
class Employee {
	void display1() {	// no passing parameter and no return type
		System.out.println("display1 method");
	}	
	void display2(int id, String name,float salary) {// passing 2 parameter but no return type
		System.out.println("Id "+id);
		System.out.println("Name "+name);
	}
	int add(int x, int y) {	//passing two parameter and return int value
		return x+y;
	}
	String sayHello() {	//no passing parameter but return string value
		return "Welcome to Java";
	}
	int[] getNumbers() {
		int abc[]={10,20,30,40};
		return abc;
	}
	void passObject(Account acc1) {
	System.out.println(acc1.accno+" "+acc1.name+" "+acc1.amount);
	}

	Account getInstance(){
		Account acc = new Account();
		acc.accno = 102102;
		acc.name ="Seeta";
		acc.amount =1000;
		return acc;
	}
}
class Test {
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	emp1.display1();	
	emp1.display2(100,"Raj",12000);
	Account acc = new Account();
	acc.accno=1010;
	acc.name="Ravi";
	acc.amount = 1200;
	emp1.passObject(acc);
	int addresult = emp1.add(100,200);
	System.out.println("Sum is "+addresult);
	int res[]=	emp1.getNumbers();
	for(int a:res) {
		System.out.println(a);
	}

	Account acc1=emp1.getInstance();
	System.out.println(acc1.accno);
	System.out.println(acc1.name);
	System.out.println(acc1.amount);
	}
}







