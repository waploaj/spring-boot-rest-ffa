package com.waploaj.fieldforceapi.controller.error

import com.waploaj.fieldforceapi.model.customer.Response
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(exception:ConstraintViolationException):Response<String>{
        return Response(
            code = 400,
            status = "failde",
            response = exception.message!!,
            message = "BadRequest"


        )
    }
}