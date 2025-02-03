package oops;

import java.util.Scanner;

class add{
	
	int a,b;
	Scanner sc=new Scanner(System.in);
	
	void add1(){
		System.out.print("Enter value of A-");
		a=sc.nextInt();
		System.out.print("Enter value of B-");
		b=sc.nextInt();
	}
	
	void show() {
		System.out.println("Value inserted...");
	}
}

class displayAdd extends add{
	
	int c;
	void showSum() {
		c=a+b;
		System.out.println("Addition of- "+a+" & "+b+" = "+c);
	}
}

class result extends displayAdd{
	void results() {
		System.out.println("Addition Succesfully Done.....");
	}
}

public class multiLlevelInheritance {

	public static void main(String[] args) {
	
		displayAdd a=new displayAdd();
		a.add1();
		a.show();
		a.showSum();
		
		result r=new result();
		//r.show();              // result obj
		//System.out.println();
		//r.showSum();
		r.results();

	}

}
