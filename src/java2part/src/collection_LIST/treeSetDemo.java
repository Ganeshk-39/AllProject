package collection_LIST;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;






public class treeSetDemo {
public static void main(String[] args) {
	  TreeSet tSet = new TreeSet();
	  tSet.add(10);
	  tSet.add(20);
	  tSet.add(30);
	  tSet.add(40);
	  tSet.add(50);
	 // System.out.println(tSet.size());
	 // System.out.println(tSet.contains(40));
	    Iterator cursor = tSet.iterator();
	    while(cursor.hasNext())
	    {
	    	System.out.println(cursor.next());
	    }
}
}
