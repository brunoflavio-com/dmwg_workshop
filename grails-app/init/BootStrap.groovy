import dmwg_workshop.Role
import dmwg_workshop.UserRole
import dmwg_workshop.User

class BootStrap {

    def init = { servletContext ->
        
      def adminRole = new Role('ROLE_ADMIN').save()
      def userRole = new Role('ROLE_USER').save()

      def testUser = new User('admin', 'password').save()

      UserRole.create testUser, adminRole, true

      assert User.count() == 1
      assert Role.count() == 2
      assert UserRole.count() == 1
        
    }

    def destroy = {
    }
}