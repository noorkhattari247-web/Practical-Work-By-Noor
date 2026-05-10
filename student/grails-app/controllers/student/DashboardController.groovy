package student

class DashboardController {

    def index() {

        [
            students: Student.count(),
            courses: Course.count(),
            enrollments: Enrollment.count()
        ]
    }
}
