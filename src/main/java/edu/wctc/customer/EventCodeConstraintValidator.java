package edu.wctc.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EventCodeConstraintValidator implements ConstraintValidator<EventCode, String> {
    private String EventPrefix;
    private String Message;

    @Override
    public void initialize(EventCode constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
