#### Entry Ticket

Please take a moment to reflect on what you have previously learned and hope to learn by completing this Google Survey. Remember your responses will be read by your instructor to help guide future lessons.

* [Guided Project Entry Ticket](https://forms.gle/7L42NGTrCJEQK5Ay7)

#### Daily Resources

* [Guided Project Initial Version](https://github.com/LambdaSchool/java-oauth2/tree/master/usermodel-initial)
* [Slido](https://app.sli.do/event/XXXXXXXX)
* [Zoom like](https://lambdaschool.zoom.us/j/#########)

#### Slack Message

@channel
Let's do this! The Java Class will be starting in 3 minutes at (https://lambdaschool.zoom.us/j/#########)
Please post questions to the Slido link at (https://app.sli.do/event/XXXXXXXX)

### Introduction and Hook

We have great backend API systems. Chances are we do not want just anybody to gain access to all of our data and we certainly don't want just anybody to manipulate our data. We need a way to secure our system. Let's introduce user authentication. User authentication allows us to say who can do what on our system. Also with user authentication, we can have real user names in our auditing fields! So, let's make us safe!

### Purpose

Add User Authentication to our systems

* Who can access our system
* Once they have access, what can they do
* Use real user names in the auditing fields

### Learning Activities

Note: Flow is taken straight from Training Kit!!!

#### Working with Objective: understand the flow and implement of Spring Security and OAuth2 to provide authentication for a project

* Add security dependencies to the POM.XML file
* Model User
  * SetPassword() update
  * Add SetPasswordNoEncrypt()
  * Add SimpleGrantedAuthority()
* Add Model UserMinimum
* Services
  * Add HelperFunctions.isAuthorizedToMakeChange
    * Update UserServiceImpl, UserEmailServiceImpl
  * Add the services SecurityUserServiceImpl and updating UserAuditing
* Add the necessary configurations
  * AuthorizationServerConfig
    * Add to main class the check for environment variables
  * SecurityConfig
  * ResourceServerConfig
* Add The 4 PreAuthorizations in UserController
* Add the 2 PreAuthorizations in UseremailControllers

* [Check for Understanding CFU - Google Form](https://forms.gle/89Aoymd3EdMv3RGSA)

#### Working with Objective: read user information from the access token

* Add endpoints in UserController
  * /getuserinfo

* [Check for Understanding CFU - Google Form](https://forms.gle/LwipvUb1DPMb8fDe6)

#### Working with Objective: understand the issues related to CORS and implement solutions to those issues

* Add SimpleCorsFilter in subpackage config

* [Check for Understanding CFU - Google Form](https://forms.gle/jYKXe5EMQe4z2Tqq7)

#### Working with Objective: understand how to implement a new user and logout endpoints

* Add the LogoutController
* Add the OpenController
  * Add UserMinimum model

* [Check for Understanding CFU - Google Form](https://forms.gle/AvyJTWmMYmfs56ee8)

#### Working with Objective: use Postman to manually test Web APIs using Authentication

* Test the endpoints with various users

* [Check for Understanding CFU - Google Form](https://forms.gle/ThVdEcvTgUQD7qys8)

## Closing

### Conclusion

#### Review what we just learned

* Restricting access to certain users
* Restricting who can do what on system
* Use real user names for our auditing fields

#### How is this related to tomorrow's topic

* How do we determine that our system is working (Test it)
* How do we document that our system is working (Test it)

----

## After Class

### Exit Ticket

Please take a moment to reflect on what you have learned in today's Guided Project. Remember your response will be read by your instructor to help guide future lessons.

* [Guided Project Exit Ticket](https://forms.gle/2bavD9H1EsUrU82p6)
