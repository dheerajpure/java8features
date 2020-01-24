package dp.java8.feature.stream._01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream02 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();

		items.add("one");
		items.add("two");
		items.add("three");

		Stream<String> stream = items.stream(); 
		
	}
}
