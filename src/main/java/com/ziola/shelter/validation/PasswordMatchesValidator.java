package com.ziola.shelter.validation;

import com.ziola.shelter.validation.annotation.PasswordMatches;
import com.ziola.shelter.workers.dto.WorkerDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        WorkerDTO workerDTO = (WorkerDTO) value;
        return workerDTO.getPassword().equals(workerDTO.getMatchingPassword());
    }
}
