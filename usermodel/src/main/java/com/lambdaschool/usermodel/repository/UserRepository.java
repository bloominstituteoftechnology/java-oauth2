package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.views.JustTheCount;
import com.lambdaschool.usermodel.views.UserNameCountEmails;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The CRUD repository connecting User to the rest of the application
 */
public interface UserRepository
    extends CrudRepository<User, Long>
{
    /**
     * Find a user based off over username
     *
     * @param username the name (String) of user you seek
     * @return the first user object with the name you seek
     */
    User findByUsername(String username);

    /**
     * Find all users whose name contains a given substring ignoring case
     *
     * @param name the substring of the names (String) you seek
     * @return List of users whose name contain the given substring ignoring case
     */
    List<User> findByUsernameContainingIgnoreCase(String name);

    /**
     * Custom Query finding the users and the count of their emails.
     * nativeQuery is set to true. This means the query will be using the actual database names of these. A preference of mine.
     * native queries are using faster
     * can lose portability to other databases if care is not taken in naming conventions
     *
     * @return List (element type is the interface UserNameCountEmails) containing usernames and the number of emails they have - not counting the primary email
     */
    @Query(value = "SELECT u.username as usernamerpt, count(ue.useremailid) as countemails FROM users u JOIN useremails ue ON u.userid = ue.userid GROUP BY u.username",
        nativeQuery = true)
    List<UserNameCountEmails> getCountUserEmails();

    /**
     * Counts the number of user role combinations for the given userid and roleid. Answer should be only 0 or 1.
     *
     * @param userid The userid of the user of the user role combination to check
     * @param roleid The roleid of the role of the user role combination to check
     * @return A single number, a count
     */
    @Query(value = "SELECT COUNT(*) as count FROM userroles WHERE userid = :userid AND roleid = :roleid",
        nativeQuery = true)
    JustTheCount checkUserRolesCombo(
        long userid,
        long roleid);

    /**
     * Deletes the given user, role combination
     *
     * @param userid The user id of the user of this user role combination
     * @param roleid The role id of the role of this user role combination
     */
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM UserRoles WHERE userid = :userid AND roleid = :roleid")
    void deleteUserRoles(
        long userid,
        long roleid);

    /**
     * Inserts the new user role combination
     *
     * @param uname  The username (String) of the user adding the record
     * @param userid The user id of the user of this user role combination
     * @param roleid The role id of the role of this user role combination
     */
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO userroles(userid, roleid, created_by, created_date, last_modified_by, last_modified_date) VALUES (:userid, :roleid, :uname, CURRENT_TIMESTAMP, :uname, CURRENT_TIMESTAMP)",
        nativeQuery = true)
    void insertUserRoles(
        String uname,
        long userid,
        long roleid);
}
