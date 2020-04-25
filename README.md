# Java User Model OAuth2

A student that completes this project shows that they can:

- Describe the OAuth2 Framework including its 4 major roles
- Describe Spring Security including its place in the Spring Framework
- Understand the Flow Spring Security and OAuth2 to provide authentication for a project
- Read user information from the access token
- Understand the issues related to CORS and implement solutions to those issues

## Introduction

This is a basic database scheme with users, user emails, and user roles. This Java Spring REST API application will provide endpoints for clients to perform the various CRUD operations on data sets contained in the application's data.

### Database layout

The table layout is as follows

- User is the driving table.
- Useremails have a Many-To-One relationship with User. Each User has many user email combinations. Each user email combination has only one User.
- Roles have a Many-To-Many relationship with Users.

![Image of Database Layout](usersdb.png)

Two different applications exist

- usermodel_initial - This is the initial application. From here we will add code specific to user security including OAuth2.
- usermodel - the finished version with all the security features in place.