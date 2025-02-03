package oops;

import java.util.Scanner;

/*class overloading{
	
	String name;
	int age;
	
	void get(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void get() {
		System.out.println("Name-"+name);
		System.out.println("Age-"+age);
	}
	int get(int a,int b) {
		System.out.println("Display Successfuly....");
		return a+b;
	}
}

public class polymorphismOverloading {

	public static void main(String[] args) {
		
		overloading o=new overloading();
		o.get("Anmol",21);
		o.get();
		System.out.println(o.get(10, 20));
	}
}
*/
class overloading{
    String name;
    int age;
    
    overloading(String name,int age){
        this.name=name;
        this.age=age;
        
       System.out.println("Name-"+name);
       System.out.println("Age-"+age);
    }
    overloading(int a,int b){
        System.out.println("A-"+a);
		System.out.println("B-"+b);
    }
}
public class polymorphismOverloading{
    public static void main(String args[]){
        
    	overloading a=new overloading("Anmol",21);
    	overloading a1=new overloading(10,20);
    }
}
