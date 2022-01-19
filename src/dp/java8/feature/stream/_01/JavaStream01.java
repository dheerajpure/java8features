package dp.java8.feature.stream._01;

import java.util.stream.IntStream;

public class JavaStream01 {
	public static void main(String[] args) {
		//Integer stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
	}
}
