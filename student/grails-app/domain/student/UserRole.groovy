package student

class UserRole {

    User user
    Role role

    static constraints = {
        user nullable: false
        role nullable: false
    }
}

