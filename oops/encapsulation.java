package oops;

import java.util.Scanner;

class dataHiding{
	
	private int empId; 
	void setter(int empId1) {
		empId=empId1;
	}
	
	int getter(){
		return empId;
	}
}

public class encapsulation {

	public static void main(String[] args) {
			
		dataHiding h=new dataHiding();
		h.setter(101);
		System.out.println(h.getter());
	}
}
