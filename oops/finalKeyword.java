package oops;

import java.util.Scanner;

final class constant{   //cant be inherited
	
     final static int a=10;         //can't be changed

	 final void method() {           //can't be overriden
		System.out.println(a);
	}
	
	 void show() {
		System.out.println("Show method of final class");
	}
}

class inherit {
	
	int a=20;
	void show() {
		System.out.println(a);
	}
	
	void method() {
		System.out.println("Overriden method");
	}
}

public class finalKeyword {

	public static void main(String[] args) {
		
		System.out.println(constant.a);
		inherit i=new inherit();
		i.show();
		i.method();
		
	}
}
