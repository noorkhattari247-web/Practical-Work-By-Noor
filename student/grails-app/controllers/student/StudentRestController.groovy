import grails.rest.*
import grails.converters.JSON

@Resource(uri='/api/students', formats=['json', 'html'])
class StudentRestController extends RestfulController<Student> {

    StudentRestController() {
        super(Student)
    }

    // custom API
    def courses(Long id) {

        def student = Student.get(id)

        if (!student) {
            render status: 404, contentType: "application/json", text: (
                    [error: "Student not found"] as JSON
            )
            return
        }

        def result = [
                id      : student.id,
                name    : student.name,
                email   : student.email,
                courses : student.enrollments.collect {
                    [
                            id    : it.course.id,
                            title : it.course.title,
                            credits: it.course.credits
                    ]
                }
        ]

        respond result
    }
}
