# Security Setup

## Users

| Username                                | Role       |
| --------------------------------------- | ---------- |
| [admin@ubs.com](mailto:admin@ubs.com)   | ROLE_ADMIN |
| [intern@ubs.com](mailto:intern@ubs.com) | ROLE_USER  |

## Security Features

* Spring Security Core dependency added
* User, Role and UserRole domain classes created
* Bootstrap users initialized
* Role-Based Access Control configured
* Admin role for management functions
* User role for normal application access

## Protected Resources

* /admin/** → ROLE_ADMIN
* /api/** → Authenticated users
* Home page and login page → Public access

