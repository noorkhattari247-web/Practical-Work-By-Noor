package student

class EnrollmentService {

    Double calculateGpa(Long studentId) {

        def student = Student.get(studentId)

        if (!student) {
            return 0.0
        }

        def enrollments = Enrollment.findAllByStudent(student)

        if (!enrollments || enrollments.size() == 0) {
            return 0.0
        }

        Double total = 0

        enrollments.each {
            total += (it.grade ?: 0)
        }

        return total / enrollments.size()
    }
}
