package student

class EnrollmentController {

    def index() {
        [enrollments: Enrollment.list()]
    }

    def create() {
        [students: Student.list(), courses: Course.list()]
    }

    def save() {

        def student = Student.get(params.long('student.id'))
        def course = Course.get(params.long('course.id'))

        def existing =
                Enrollment.findByStudentAndCourse(student, course)

        if(existing) {

            flash.message = "Already enrolled"

            redirect(action:"create")
            return
        }

        def enrollment = new Enrollment(
                student: student,
                course: course,
                grade: params.double('grade')
        )

        enrollment.save(flush:true)

        flash.message = "Saved"

        redirect(action:"index")
    }

    def delete(Long id) {

        def enrollment = Enrollment.get(id)

        enrollment?.delete(flush:true)

        flash.message = "Deleted"

        redirect(action:"index")
    }
}
