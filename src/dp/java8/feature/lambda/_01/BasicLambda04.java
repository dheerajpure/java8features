package dp.java8.feature.lambda._01;

@FunctionalInterface
interface int2{
	 String test(String param) ;
}

public class BasicLambda04 {
	  public static void main(String args[])
	    {
		  int2 abc=(String param)->{  
			  return "after processing business logic - "+param; 
			  };
			  
			  
			  System.out.println(abc.test("first String"));
			  System.out.println(abc.test("second String"));
		  }
}