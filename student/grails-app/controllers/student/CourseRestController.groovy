import grails.rest.*

@Resource(uri='/api/courses', formats=['json', 'html'])
class CourseRestController extends RestfulController<Course> {

    CourseRestController() {
        super(Course)
    }
}
