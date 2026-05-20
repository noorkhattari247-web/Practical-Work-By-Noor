import grails.rest.*

@Resource(uri='/api/enrollments', formats=['json', 'html'])
class EnrollmentRestController extends RestfulController<Enrollment> {

    EnrollmentRestController() {
        super(Enrollment)
    }
}
