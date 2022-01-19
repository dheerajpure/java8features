package dp.java8.feature.lambda.operator.double_colon._01;

public class DoubleColon {
	public static void main(String[] args) {
		int i=3;int j = 4;
		//funcInt result = DoubleColon::add;
		//System.out.println(result);
	}
	
	public static int add(int i, int j) {
		return i+j;
	}
}

interface funcInt{
	public static int add(int i, int j) {
		return i+j;
	}
}