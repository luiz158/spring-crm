package com.springcrm.module.contact.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springcrm.module.contact.model.Contact;

@Component
public class ContactValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return Contact.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
    	Contact contact = (Contact) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname", "last name should not be empty");
    
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "select gender");

        if (contact.getGender() == null || (contact.getGender() != 1 && contact.getGender() != 2)) {
            errors.rejectValue("gender", "select gender");
        }
        
        /*
        if (content.getT().length() < 6 || user.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (userService.findByUsername(user.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
        */
    }
}
