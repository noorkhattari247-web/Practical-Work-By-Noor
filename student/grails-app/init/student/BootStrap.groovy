package student

class BootStrap {

    def init = {

        if (!Role.findByAuthority('ROLE_ADMIN')) {

            def adminRole = new Role(
                    authority: 'ROLE_ADMIN'
            ).save(flush: true)

            def userRole = new Role(
                    authority: 'ROLE_USER'
            ).save(flush: true)

            def admin = new User(
                    username: 'admin@ubs.com',
                    password: 'admin123'
            ).save(flush: true)

            def intern = new User(
                    username: 'intern@ubs.com',
                    password: 'intern123'
            ).save(flush: true)

            new UserRole(
                    user: admin,
                    role: adminRole
            ).save(flush: true)

            new UserRole(
                    user: intern,
                    role: userRole
            ).save(flush: true)
        }
    }

    def destroy = {
    }
}
