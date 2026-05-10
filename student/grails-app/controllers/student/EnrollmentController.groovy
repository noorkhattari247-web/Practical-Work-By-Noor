package student

class EnrollmentController {

    EnrollmentService enrollmentService

    def index() {
        [enrollments: Enrollment.list()]
    }

    def create() {
        [students: Student.list(), courses: Course.list()]
    }

    def save() {

        def result = enrollmentService.enroll(
                params.long('student.id'),
                params.long('course.id')
        )

        if(result) {
            flash.message = "Saved"
        } else {
            flash.message = "Duplicate"
        }

        redirect(action:"index")
    }

    def delete(Long id) {

        enrollmentService.unenroll(id)

        redirect(action:"index")
    }
}
