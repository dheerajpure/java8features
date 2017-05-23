package dp.java8.feature.stream.parallel_sequential;

/**
 * http://www.journaldev.com/2389/java-8-features-with-examples
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 500; i++)
			myList.add(i);

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		
		// using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		long startTime = time();
		System.out.println("start time"+startTime);
		// using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel=" + p));
		long endTime = time();
		System.out.println("end time"+endTime);
		System.out.println("diff : "+ (endTime - startTime));
		System.out.println("\n\n++++++++++++++++++++++++++++++++ \n\n\n");
		
		long startTime1 = time();
		System.out.println("start time"+startTime1);
		
		
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out
				.println("High Nums sequential=" + p));
		
		long endTime1 = time();
		System.out.println("end time"+endTime1);
		System.out.println("diff : "+ (endTime1 - startTime1));
	}
	

	private static long time() {
		return System.currentTimeMillis();
	}
	
	/*private static long diffTime(long startTime, long endTime){
		return endTime - startTime;
	}*/
}