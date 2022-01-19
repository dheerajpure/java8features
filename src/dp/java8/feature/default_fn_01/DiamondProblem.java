package dp.java8.feature.default_fn_01;

interface int1 {
	default void show() {
		System.out.println("int1");
	}
	/* A default method cannot override a method from java.lang.Object 
	 * https://youtu.be/4e_RsZWdiSc?list=PLsyeobzWxl7otduRddQWYTQezVul0xIX6&t=926
	 */
	/*
	default boolean equals(Object o) {
		return true;
	}
	*/ 
}

interface int2 {
	default void show() {
		System.out.println("int2");
	}
}

/**
 * show() in DiamondProblem
 * show() in DiamondProblem
 * show() in DiamondProblem
 *
 */
public class DiamondProblem implements int1, int2 {

	public static void main(String[] args) {
		int1 d1 = new DiamondProblem();
		d1.show();
		int2 d2 = new DiamondProblem();
		d2.show();
		DiamondProblem d3 = new DiamondProblem();
		d3.show();
		
	}

	@Override
	public void show() {
		System.out.println("show() in DiamondProblem");
	}

}
