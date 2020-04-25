package com.lambdaschool.usermodel.exceptions;

import com.lambdaschool.usermodel.models.ValidationError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to override the error details provided by Spring Boot. We want to use our own format.
 */
@Component
public class CustomErrorDetails
    extends DefaultErrorAttributes
{
    /**
     * Connects this class with the Message Source for validation error reporting
     */
    @Autowired
    private MessageSource messageSource;

    /**
     * Custom method to override the error details provided by Spring Boot. We want to use our own format.
     *
     * @param webRequest        The information related to the request that was made and the exceptions that occurred.
     * @param includeStackTrace Should we include the Stack Trace in our output. This field is not used in our implementation.
     * @return a Map of String, Object with our information to report in place of the standard Spring Boot information.
     */
    @Override
    public Map<String, Object> getErrorAttributes(
        WebRequest webRequest,
        boolean includeStackTrace)
    {

        //Get all the normal error information
        Map<String, Object> errorAttributes =
            super.getErrorAttributes(webRequest, includeStackTrace);

        // Linked HashMaps maintain the order the items are inserted. I am using it here so that the error JSON
        // produced from this class lists the attributes in the same order as other classes.
        Map<String, Object> errorDetails = new LinkedHashMap<>();
        errorDetails.put("title", errorAttributes.get("error"));
        errorDetails.put("status", errorAttributes.get("status"));
        errorDetails.put("detail", errorAttributes.get("message"));
        errorDetails.put("timestamp", errorAttributes.get("timestamp"));
        errorDetails.put("developerMessage", "path: " + errorAttributes.get("path"));

        // Find any data violations that might be associated with the error and report them
        // data validations get wrapped in other exceptions as we work through the Spring
        // exception chain. Hence we have to search the entire Spring Exception Stack
        // to see if we have any violation constraints.
        Throwable cause = this.getError(webRequest);
        while ((cause != null) && !(cause instanceof ConstraintViolationException))
        {
            cause = cause.getCause();
        }

        // we know that cause either null or an instance of ConstraintViolationException
        if (cause != null)
        {
            List<ValidationError> listVE = new ArrayList<>();

            ConstraintViolationException ex = (ConstraintViolationException) cause;
            for (ConstraintViolation cv : ex.getConstraintViolations())
            {
                ValidationError newVe = new ValidationError();
                newVe.setCode(cv.getInvalidValue()
                    .toString());
                newVe.setMessage(cv.getMessage());
                listVE.add(newVe);
            }
            errorDetails.put("errors", listVE);
        } else
        {
            // we had no violation constraint errors so nothing to report
            errorDetails.put("errors", "{}");
        }

        return errorDetails;
    }
}
