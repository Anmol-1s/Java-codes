package oops;

import java.util.Scanner;

abstract class vehicle{           //abstract class contain both abstract and concrete method
	
	abstract void start();               //Abstract method always defined in abstract class
	
	abstract void stop();
	
	vehicle(){
		System.out.println("Abstract class can contain constructor");
	}
	
	void function() {                             //concrete method
		System.out.println("Start with Key...");
		System.out.println("Stop with Break..");
	}
	
	static void engine() {                                //can contain static method
		System.out.println("Start When Engine Start...(Static)");
	}
	
	final void petrol() {                             //can contain final method
		System.out.println("Need petrol to Start..(Final)");
	}
}

class details extends vehicle{         
	   //class which override the abstract class must contain abstract method of that class
	
	void start() {
		System.out.println("Abstract method-hiding details of start function");
	}
	
	void stop() {
		System.out.println("Abstract method-hiding details of stop function");
	}
}

public class abstraction_abstractClass {

	public static void main(String[] args) {
		
		details d=new details();
		d.engine();    //vehicle.engine();
		d.petrol();           //final method can't be overriden
		d.function();
		d.start();
		d.stop();
	}
}
