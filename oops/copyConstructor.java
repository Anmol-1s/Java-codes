package oops;

import java.util.Scanner;

class copy{
	
	String name;
	float age;
	
	copy(String sname,float sage){   //parameterised c
		name=sname;
		age=sage;
	}
	
	copy(copy c){
		name=c.name;
		age=c.age;
	}
	
	void show() {
		System.out.println("Name-"+name);
		System.out.println("Age-"+age);
	}
	
}

public class copyConstructor {

	public static void main(String[] args) {
	
		copy co=new copy("Anmol",21);
		System.out.println("Original Constructor");
		co.show();
		co.age=22;
		co.show();
		
		System.out.println();
		
		copy co1=new copy(co);
		System.out.println("Copy Constructor");
		co1.show();
	}

}
