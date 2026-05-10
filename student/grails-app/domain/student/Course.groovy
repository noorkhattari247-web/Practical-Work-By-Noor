package student

class Course {

    String title
    Integer creditHours

    static hasMany = [enrollments: Enrollment]

    static constraints = {
        title blank:false
        creditHours min:1
    }
}
