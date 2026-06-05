package student

class Student {

    String name
    String email

    static hasMany = [enrollments: Enrollment]

    static responseFormats = ['json', 'html']

    static constraints = {
        name blank: false
        email blank: false, email: true
    }
}
