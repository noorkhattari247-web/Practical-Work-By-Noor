package student

class Enrollment {

    Double grade
    Date enrolledAt = new Date()

    static belongsTo = [
        student: Student,
        course: Course
    ]

    static constraints = {
        grade nullable: true
    }
}
