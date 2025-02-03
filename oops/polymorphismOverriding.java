package oops;

import java.util.Scanner;

class over{
	
	over(){
		System.out.println("Value inserted for Addition");
	}
	
	int sum(int a,int b) {
		return a+b;
	}
}

class overriding extends over{
	
	overriding(){
		System.out.println("Value inserted for Addition");
	}
	
	int sum(int a,int b) {
		
		System.out.println(super.sum(10, 20));

		return a-b;
		
	}
}

public class polymorphismOverriding {

	public static void main(String[] args) {
		
		overriding r=new overriding();
		System.out.println(r.sum(40, 20));
		
	}

}
