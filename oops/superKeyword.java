package oops;

import java.util.Scanner;

class parent{
	
	int a=10;
	parent(){
		System.out.println("Parent Constructor without paramter");
	}
	parent(int a){
		this();     //call the above constructor of current class    //constructor chaining
		System.out.println("Parent Constructor with paramter");
	}
	void get() {
		System.out.println("Parent class method");
	}
}

class child extends parent{
	
	int a=20;
	child(){
		super(10);               //calling constructor
		super.get();            //calling parent class method
	}
	void set() {
		System.out.println("child class A -"+super.a);  //using value a from parent class
	}
	
	void show(int a) {
		System.out.println("Local variable - "+a);                         //a=30
		System.out.println("Instance variable of current class - "+this.a); //a=20
		System.out.println("Parent class instance variable - "+super.a);    //a=10
	}
}

public class superKeyword {

	public static void main(String[] args) {
		
		child c=new child();
		c.set();
		c.show(30);

	}
}
