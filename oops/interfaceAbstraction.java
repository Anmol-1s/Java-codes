package oops;

import java.util.Scanner;

interface i1{
	
	 int a=10;                             //default public static final
	 void show();                          //default public abstract method
	 default void get() {
		 System.out.println("Default method");
	 }
}

interface i2 extends i1{                   //interface inherit interface through extends keyword          
	
	 void show1();
	 static void get1() {
		 System.out.println("static method");
	 }
}

class C implements i2{
	
	 public void show() {
		System.out.println("Abstract Method of i1");
	 }
	 
	 public void show1() {
		 System.out.println("Abstrat method of i2");
	 }
	 
	 void set() {
		 System.out.println(a);
	 }
	
}

public class interfaceAbstraction {

	public static void main(String[] args) {
		
		C c=new C();
		c.get();
		i2.get1();
		c.show();
		c.show1();
		c.set();
	}
}
