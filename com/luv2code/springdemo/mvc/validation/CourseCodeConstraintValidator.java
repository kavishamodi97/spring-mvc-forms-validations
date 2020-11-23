package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		// TODO Auto-generated method stub
		coursePrefix=courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext ConstraintValidatorContext ) {
		// TODO Auto-generated method stub
		
		boolean result;
		if(code!=null) {
	   result=code.startsWith(coursePrefix);
			
		}
		else {
			return true;
		}
		return result;
	}

}
