package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.ValidationError;

import java.util.List;

/**
 * Class contains helper functions - functions that are needed throughout the application. The class can be autowired
 * into any class.
 */
public interface HelperFunctions
{
    /**
     * Searches to see if the exception has any constraint violations to report
     *
     * @param cause the exception to search
     * @return constraint violations formatted for sending to the client
     */
    List<ValidationError> getConstraintViolation(Throwable cause);

}
