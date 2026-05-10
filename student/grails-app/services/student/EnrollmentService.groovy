package student

import grails.gorm.transactions.Transactional
import groovy.util.logging.Slf4j

@Slf4j
@Transactional
class EnrollmentService {

    def enroll(Long studentId, Long courseId) {

        log.info("Enroll started")

        try {

            def student = Student.get(studentId)
            def course = Course.get(courseId)

            if(!student || !course) {
                return null
            }

            def existing =
                Enrollment.findByStudentAndCourse(student, course)

            if(existing) {
                return null
            }

            def enrollment = new Enrollment(
                student: student,
                course: course
            )

            enrollment.save(flush:true)

            return enrollment

        } catch(Exception e) {

            log.error("Error", e)

            return null
        }
    }

    def unenroll(Long id) {

        log.info("Delete started")

        try {

            def enrollment = Enrollment.get(id)

            enrollment?.delete(flush:true)

        } catch(Exception e) {

            log.error("Delete Error", e)
        }
    }

    Double calculateGpa(Long studentId) {

        def enrollments =
            Enrollment.findAllByStudent(Student.get(studentId))

        if(!enrollments) {
            return 0
        }

        double total = 0

        enrollments.each {
            total += it.grade ?: 0
        }

        return total / enrollments.size()
    }
}
