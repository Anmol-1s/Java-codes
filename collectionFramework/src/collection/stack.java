package collection;

import java.util.Stack;
public class stack {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push(100);
		s.push("Rashi");
		s.push('R');
		s.push(21.9);
		s.push(400);
		s.add(10);
		
		System.out.println(s);
		
		//System.out.println(s.pop());
		//System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.search(100));
		System.out.println(s.search(10));
		System.out.println(s.search(102));
		
		System.out.println(s.empty());
		
	}

}
