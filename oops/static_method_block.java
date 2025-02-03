package oops;

class method{
	
	static int a=10;
	static void sum() {
		System.out.println(a);
		System.out.println("Static method of sum");
		add();         // directly call method without static also
	}
	
	static void add() {
		System.out.println("Static method of Add ");
	}
	method() {
		System.out.println(a);
	}
	void sub() {
		System.out.println(a);   //we can use static variable in method and constructor
	}
	
}

public class static_method_block {

	 //print before main method but have to create main method for print static block
	static {   
		System.out.println("HEllo i am Static block..."); 
	}
	
	static {
		System.out.println("Hello i am static block 2"); //make multiple static block
	}
	
	public static void main(String[] args) {
		
	//	method.sum();
	//	method m=new method();
	//	m.sub();
	}
	static {
		System.out.println("Hello i am static block 3");
		method.sum();                                       //we can all method and static method
		method.add();
	}
}
