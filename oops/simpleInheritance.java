package oops;

import java.util.Scanner;

class sum{
	
	String name;
	int age;
	float salary;
	Scanner sc=new Scanner(System.in);
	
	void get() {
		System.out.print("enter the name-");
		name=sc.nextLine();
		System.out.print("Age-");
		age=sc.nextInt();
		System.out.print("Salary-");
		salary=sc.nextFloat();
	}
}

class B extends sum{
	
	void show() {
		System.out.println("Name-"+name);
		System.out.println("Age-"+age);
		System.out.println("Salary-"+salary);
	}
}

public class simpleInheritance {

	public static void main(String[] args) {
		
		B b=new B();
		b.get();
		b.show();
	}
}
