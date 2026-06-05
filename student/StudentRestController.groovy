package student

import grails.rest.*

@Resource(uri='/api/students', formats=['json'])
class StudentRestController extends RestfulController<Student> {

    StudentRestController() {
        super(Student)
    }

    def index(Integer max) {

        params.max = Math.min(max ?: 10, 100)
        params.offset = params.int('offset') ?: 0

        def criteria = Student.createCriteria()

        def students = criteria.list(
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
}
