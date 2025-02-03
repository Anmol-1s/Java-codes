package oops;

 interface multiple{
	
	public int a=20;
	public void set();
	default void setter() {
		System.out.println("Default");
	}
}

interface inheritance{
	
	public int c=30;
	public void get();
	
	static void getter() {
		System.out.println("Static");
	}
}
class mi implements multiple,inheritance{
	
	public void set() {
		System.out.println("multiple interface method");
	}
	
	public void get() {
		System.out.println("inheritance interface method");
	}
}

public class interface_multipleInheritance {

	public static void main(String[] args) {
		
		mi m=new mi();
		System.out.println("Multiple a- "+multiple.a);
		m.set();
		System.out.println("Inheritance c- "+inheritance.c);
		m.get();
		inheritance.getter();
		m.setter();
	}

}
