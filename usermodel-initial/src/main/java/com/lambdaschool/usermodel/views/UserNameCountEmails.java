package com.lambdaschool.usermodel.views;

/**
 * Used to format the JSON output for a custom query that gathers information on username and the count of how many emails they have
 */
public interface UserNameCountEmails
{
    /**
     * The name of the user. Must be called usernamerpt
     *
     * @return the name (String) of user
     */
    String getUsernamerpt();

    /**
     * The count of the emails. Must be called countemails
     *
     * @return the count (int) of the mails
     */
    int getCountemails();
}
