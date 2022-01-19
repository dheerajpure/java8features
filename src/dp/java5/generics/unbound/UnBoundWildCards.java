package dp.java5.generics.unbound;

import java.util.ArrayList;
import java.util.List;

//https://stackoverflow.com/questions/35272848/java-generics-unbound-wildcards-vs-object

public class UnBoundWildCards {

	private static void addObjectToList1(final List<?> aList, final Object o ) {
	   // aList.add(o);
	}

	private static void addObjectToList2(final List<Object> aList, final Object o ) {
	    aList.add(o);
	}

	private static <T> void addObjectToList3(final List<T> aList, final T o ) {
	    aList.add(o);
	}


	public static void main(String[] args) {
	    List<String> testList = new ArrayList<String>();
	    String s = "Add me!";
	    addObjectToList1(testList, s);
	  //  addObjectToList2(testList, s);
	    addObjectToList3(testList, s);
	}

}
