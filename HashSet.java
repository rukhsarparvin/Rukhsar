 import java.util.*;
 class HashSet2 {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("One");
 
 		Iterator<String> itr = s.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());

	}

}