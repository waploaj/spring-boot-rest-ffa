package com.waploaj.fieldforceapi.validation

import javax.validation.ConstraintViolationException
import org.springframework.stereotype.Component
import javax.validation.Validator


@Component
class ValidationUtil(val validator: Validator) {
    fun validate(any: Any){
        val result = validator.validate(any)
        if (result.size !=0){
            throw ConstraintViolationException(result)
        }
    }
}