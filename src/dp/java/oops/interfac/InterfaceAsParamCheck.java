package dp.java.oops.interfac;


interface MyInterface{
	void myInterfaceMethod();
}

class MyClass{
	void myClassMethod(MyInterface m){
		System.out.println("MyInterface passed as parameter ...");
		m.myInterfaceMethod();
	}
}

public class InterfaceAsParamCheck {
	
	public static void main(String[] args) {
		System.out.println("Main method ...");
		new MyClass().myClassMethod(new MyInterface() {
			@Override
			public void myInterfaceMethod() {
				System.out.println("inside inner --> myInterfaceMethod");
				
			}
		});
	}

}
