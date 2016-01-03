package com.mcvn.project.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public abstract class BaseValidator<T> implements Validator {
	
	@SuppressWarnings("unchecked")
	@Override
	final public void validate(Object target, Errors errors) {
		T t = (T) target;
		
		doValidate(t, errors);

	}
	
	public abstract void doValidate(T target, Errors errors); 

}
