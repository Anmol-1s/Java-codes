package collection;

import java.util.LinkedList;
public class linkedList {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(0.105);
		ll.add(1,"Anmol");
		ll.add(2,"Soni");
		ll.add(3,21);
		ll.add(4,'A');
		ll.add(5,null);
		ll.add(6,null);
		
		//ll.addFirst("Rashi");
		//ll.addLast('R');
		
		//ll.removeFirst();
		//ll.removeLast();
		
		//System.out.println(ll);
		//System.out.println(ll.getFirst());
		//System.out.println(ll.getLast());
		
		LinkedList l2=new LinkedList(ll);
		
		l2.add(1,"Sanskar");
		l2.add(2,"Dev");
		l2.add(3,41);
		
		System.out.println(l2);
	}

}
