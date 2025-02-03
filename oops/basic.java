package oops;

import java.util.Scanner;

class A{
	
	String name;
	int age;
	
	void get() {
		System.out.println("Hello World...");
	}
	void show() {
		System.out.println("Name-"+name);
		System.out.println("Age-"+age);
	}
}

public class basic {

	public static void main(String[] args) {
		
		A a=new A();
		a.get();
		
		a.name="Anmol Soni";
		a.age=21;
		a.show();
		
		a.name="Rashi Soni";
		a.age=20;
		a.show();
		
		a.name="Akshat Soni";
		a.age=19;
		a.show();
	}

}
