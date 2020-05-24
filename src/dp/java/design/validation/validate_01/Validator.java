package dp.java.design.validation.validate_01;

public interface Validator<T> {
	
	public Result validate(T value);

}
