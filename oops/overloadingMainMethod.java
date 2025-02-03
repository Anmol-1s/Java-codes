package oops;

public class overloadingMainMethod {

	public static void main(int a) {
		System.out.println("Main method- "+a);
	}
	public static void main(String[] args) {
		
		overloadingMainMethod o=new overloadingMainMethod();
		o.main(20);
		System.out.println("Main method overloaded successfuly....");
	}

}
