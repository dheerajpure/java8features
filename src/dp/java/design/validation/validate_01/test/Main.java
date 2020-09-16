package dp.java.design.validation.validate_01.test;

import dp.java.design.validation.validate_01.Result;
import dp.java.design.validation.validate_01.Validator;
import dp.java.design.validation.validate_01.rules.CompositePasswordRule;
import dp.java.design.validation.validate_01.validators.AlphaNumericValidtor;
import dp.java.design.validation.validate_01.validators.MinLengthValidator;


//https://github.com/JExaples/quicklooks/tree/master/Chain-of-Responsibility/src/com/jgodara/validation/cor
//https://stackoverflow.com/questions/23408923/for-a-large-validation-task-is-chain-of-responsibility-pattern-a-good-bet
public class Main {
	

	public static void main(String[] args) throws Exception {
		Validator<String> pwRule = new CompositePasswordRule(
				new MinLengthValidator(), new AlphaNumericValidtor());
		Result result = pwRule.validate("Test4511111111");
		if (!result.isOk())
			throw new Exception(result.getMessage());

		System.out.println("All Checks Passed:\n" + result);
	}

}
