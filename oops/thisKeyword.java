package oops;

class T {
    int a, b;
    String name;

    T() {
        System.out.println("Default Constructor ...");
    }

    T(int a, int b) {
    	this();                              // Call another constructor using `this`
        System.out.println("Constructor with arguments");
    }
    
///////////////above part is called constructor chaining//////////////////////////
    
    void get(int a, String name) {
        this.a = a;           // Assign to instance variable `a`
        this.name = name;     // Assign to instance variable `name`
        this.b = 50;          // Assign a new value to instance variable `b`
    }

    void set() {
        this.get(21, "Anmol"); // Call the `get` method using `this`
        System.out.println("Name- " + name);
        System.out.println("Age- " + a);
        System.out.println("B- " + b); // Use instance variable `b`
    }
    
  ///////////////////////////////////////////////////////////////////////
    
    void getter(T t) {
    	System.out.println("Getter method");
    }
    void setter() {
    	getter(this);              //passing this keyword as referenece
    }
}

class T1{
	
	T1 m1() {
		System.out.println("Return instance of T1");
		return this;
	}
}

public class thisKeyword {
    public static void main(String[] args) {
        T t = new T(10,20);
        t.set();
        t.setter();
        
        T1 t1=new T1();
        t1.m1();
    }
}
