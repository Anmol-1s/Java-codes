package oops;

import java.util.Scanner;

class S{
	
	String name;
	int age;
	static float salary=60000;     //
	
	S(String name,int age ){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	void show() {
		System.out.println("Employee Name- "+name);
		System.out.println("Employee Age- "+age);
		System.out.println("Employee Salary- "+salary);
	}
}

class counter{
	
	int a=0;
	static int b=0;
	
	void count(){
			a++;
			System.out.print(a);
	}
	
	void count1() {
		
			b++;
			System.out.print(b);
	}
}
public class staticKeyword {

	public static void main(String[] args) {
	
		S s=new S("Anmol",21);
		s.show();
		S s1=new S("Akshat",19);
		s1.show();
		S s2=new S("Anurag",20);
		s2.show();
		
		counter c=new counter();
		c.count();
		counter c1=new counter();
		c1.count();
		counter c2=new counter();
		c2.count();
		
		System.out.println();
		c.count1();
		c1.count1();
		c2.count1();
		
	}

}
