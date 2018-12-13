interface Abc {
	int A=0;
	void dis1();
}
interface Mno {
	int B=10;
	void dis2();
}
interface Xyz extends Abc,Mno{
	int C=20;
	void dis3();
}
class Demo implements Abc,Mno {
	public void dis1() {
		System.out.println("Abc interface method");
	}
	public void dis2() {
		System.out.println("Mno interface method");
	}	
}
class Test {
	public static void main(String args[]) {
	Demo obj1 = new Demo();
	obj1.dis1();
	obj1.dis2();	
	}
}







