package oops;

import java.util.Scanner;

class parameterised{
	
	String name;
	float salary;
	
	parameterised(String name,float salary){
		this.name=name;
		this.salary=salary;
	}
	
	void show() {
		System.out.println("Name-"+name);
		System.out.println("Salary-"+salary);
	}
}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		
		parameterised p=new parameterised("Anmol",50000);
		parameterised p1=new parameterised("Anurag",30000);
		parameterised p2=new parameterised("Aradhya",40000);
		parameterised p3=new parameterised("Akshat",90000);
		p.show();
		p1.show();
		p2.show();
		p3.show();
	}

}
