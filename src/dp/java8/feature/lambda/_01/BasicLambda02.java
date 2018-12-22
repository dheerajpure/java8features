package dp.java8.feature.lambda._01;


public class BasicLambda02 {
	  public static void main(String args[])
	    {
	        IntOperation op = (int x, int y)-> 
	        { //for more than one line its block with { };
	        	if(y==0) return 0;
	        	else return x/y;
	        };
	        System.out.println(op.divide(10,5)); 
	    }
}

interface IntOperation{
    int divide(int x,int y);
}