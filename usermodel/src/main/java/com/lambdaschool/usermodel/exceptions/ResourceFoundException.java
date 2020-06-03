package com.lambdaschool.usermodel.exceptions;

/**
 * A custom exception to be used when a resource is found but is not suppose to be
 */
public class ResourceFoundException
        extends RuntimeException
{
    public ResourceFoundException(String message)
    {
        super("Error from a Lambda School Application " + message);
    }
}