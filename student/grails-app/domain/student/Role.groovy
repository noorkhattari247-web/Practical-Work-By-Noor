package student

class Role {

    String authority

    static constraints = {
        authority blank: false, unique: true
    }

    String toString() {
        authority
    }
}
