package dp.java8.feature.lambda._01;
public class BasicLambda00 {
	  public static void main(String args[])   {
		  //here in MyInt, method name doesn't important only signature matters
		  //lambda way initializing variable
		 MyInt a = ()->{
			  System.out.println("this is anonymous implementation");
		  };
		  
		  a.myMethod();//execute above a variable without method
		  privateMethod(a); //execute above a variable with method
		  
		  a=new MyIntImpl(); a.myMethod(); //execute from implementation class
		  }
	  		static void privateMethod(MyInt pm) {
	  			pm.myMethod();
	  		}
	    }

@FunctionalInterface
interface MyInt{
	void myMethod();
}
class MyIntImpl implements MyInt{
	@Override
	public void myMethod() {
		System.out.println("this is old school code");
	}
}