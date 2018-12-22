package dp.java8.feature.lambda._01;

interface int1{
	int square(Integer j);
}

public class BasicLambda03 {
	  public static void main(String args[])
	    {
		  
		  
		  
		  int1 i =(Integer j) -> {
	    	   return j*2;
	       };
	       System.out.println(i.square(2));
	    }
}

