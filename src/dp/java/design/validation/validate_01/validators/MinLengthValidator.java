package dp.java.design.validation.validate_01.validators;

import dp.java.design.validation.validate_01.Result;
import dp.java.design.validation.validate_01.Validator;
import dp.java.design.validation.validate_01.results.SimpleResult;

public class MinLengthValidator implements Validator<String> {

	private final Result FAILED;
	private Integer minLength;

	public MinLengthValidator() {
		this(8);
	}

	public MinLengthValidator(Integer minLength) {
		this.minLength = minLength;
		FAILED = new SimpleResult("Password must be at least " + minLength
				+ " characters long.", false);
	}

	@Override
	public Result validate(String value) {
		return value.length() >= minLength ? Result.OK : FAILED;
	}
	
	@Override
	public String toString() {
		return "MinLengthValidator";
	}

}
