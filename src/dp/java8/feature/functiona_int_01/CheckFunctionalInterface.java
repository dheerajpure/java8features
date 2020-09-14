package dp.java8.feature.functiona_int_01;

//https://www.journaldev.com/2763/java-8-functional-interfaces#:~:text=The%20major%20benefit%20of%20java,a%20lot%20of%20functional%20interfaces.
public class CheckFunctionalInterface {

}

interface Foo<T> {
	void m(T arg); 
}
interface Bar<T> { 
	void m(T arg); 
}
//interface FooBar<X, Y> extends Foo<X>, Bar<Y> {}
interface FooBar<X, Y> extends Foo<X>, Bar<X> {}