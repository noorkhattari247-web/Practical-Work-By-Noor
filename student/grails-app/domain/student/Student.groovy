package student

class Student {

    String name
    String email

    static hasMany = [enrollments: Enrollment]

    static constraints = {
        name blank:false
        email blank:false, unique:true
    }
}
