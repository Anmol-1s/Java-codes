package oops;

import java.util.Scanner;

class sub{
	 
	static float a,b;
	Scanner sc=new Scanner(System.in);
	
	void get() {
		System.out.print("Enter the value of A and B- ");
		a=sc.nextFloat();
		b=sc.nextFloat();
	}
}

class insert extends sub{
	
	void insertShow() {
		System.out.println("Inserted value Successfully....");
	}
}

class displaySub extends sub{
	  
	float c;
	void show() {
		c=a-b;
		System.out.println("Subtraction of - "+a+" & "+b+" => "+c);
	}
	
	void result() {
		System.out.println("Subtraction Successfully done...");
	}
}

public class heirarchicalInheritance {

	public static void main(String[] args) {
		
  /*    displaySub s=new displaySub();
		s.get();
		
		insert i=new insert();
		i.insertShow();
		
		s.show();
		s.result();
		
*/
		insert i=new insert();
		i.get();
		i.insertShow();
		
		displaySub s=new displaySub();
		s.show();
		s.result();
	}

}
