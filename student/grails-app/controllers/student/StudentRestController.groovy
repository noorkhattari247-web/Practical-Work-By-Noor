package student

import grails.rest.*
import grails.converters.JSON

@Resource(uri='/api/students', formats=['json', 'html'])
class StudentRestController extends RestfulController<Student> {

    EnrollmentService enrollmentService

    StudentRestController() {
        super(Student)
    }

    @Override
    def index(Integer max) {

        params.max = Math.min(max ?: 10, 100)
        params.offset = params.int('offset') ?: 0

        def students = Student.createCriteria().list(
                max: params.max,
                offset: params.offset
        ) {

            if (params.name) {
                ilike("name", "%${params.name}%")
            }

            if (params.email) {
                ilike("email", "%${params.email}%")
            }
        }

        respond([
                total: students.totalCount,
                page : (params.offset / params.max) + 1,
                data : students
        ])
    }

    def courses(Long id) {

        def student = Student.get(id)

        if (!student) {

            render status:404,
                    contentType:"application/json",
                    text:([error:"Student not found"] as JSON)
            return
        }

        respond([
                id: student.id,
                name: student.name,
                email: student.email,
                courses: student.enrollments.collect {
                    [
                            id: it.course.id,
                            title: it.course.title,
                            creditHours: it.course.creditHours
                    ]
                }
        ])
    }

    def gpa(Long id) {

        def student = Student.get(id)

        if (!student) {

            render status:404,
                    contentType:"application/json",
                    text:([error:"Student not found"] as JSON)
            return
        }

        respond([
                studentId: id,
                gpa: enrollmentService.calculateGpa(id)
        ])
    }
}
