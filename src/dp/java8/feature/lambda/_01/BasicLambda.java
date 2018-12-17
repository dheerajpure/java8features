package dp.java8.feature.lambda._01;

public class BasicLambda {
	  public static void main(String args[])
	    {
	        // lambda expression to implement above
	        // functional interface. This interface
	        // by default implements abstractFun()
	        FuncInterface fobj = (int x, int y)->System.out.println(x+y);
	        FuncInterface1 fobj1 = (int x, int y)-> (x+y)+"";
	 
	        // This calls above lambda expression and prints sum.
	        fobj.abstractFun(5,10);
	        System.out.println(fobj1.abstractFun(1,1));
	    }
}

@FunctionalInterface
interface FuncInterface{
    // An abstract function
    void abstractFun(int x,int y);
}

@FunctionalInterface
interface FuncInterface1{
    // An abstract function
    String abstractFun(int x,int y);
}