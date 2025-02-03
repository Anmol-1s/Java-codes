package oops;

import java.util.Scanner;

class constructor{
	
	String name;
	int salary;
	Scanner sc=new Scanner(System.in);
	
	constructor(){
		
		System.out.print("Enter the Name-");
		name=sc.nextLine();
		System.out.print("Enter the Salary");
		salary=sc.nextInt();
	}
	
	void show() {
		System.out.println("Name-"+name);
		System.out.println("Salary-"+salary);
	}
}

public class defaultConstructor {

	public static void main(String[] args) {
		
		constructor c=new constructor();
		c.show();
		
	}

}
