package haptic.ai

import haptic.app.UserRole
import haptic.app.User
import haptic.app.Role

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                //setupUsersAndRoles()
            }
            test {
                //setupUsersAndRoles()
            }
            production {
                // do nothing
            }
        }
    }
    def destroy = {
    }

    def setupUsersAndRoles() {
        User admin = new User(username: "admin", password: "supersecret",
                bio: 'Some Bio', birthDate: new Date(), birthPlace: "Home Town", height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg")

        saveObject(admin)
        User user = new User(username: "deluongo", password:"Stephany",
                bio: 'Some Bio', birthDate: new Date(), birthPlace: "Home Town", height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg")
        saveObject(user)

        Role adminRole = new Role(authority: Role.ROLE_ADMIN)
        saveObject(adminRole)
        Role userRole = new Role(authority: Role.ROLE_USER)
        saveObject(userRole)

        UserRole.create(admin, adminRole)
        UserRole.create(admin, userRole)
        UserRole.create(user, userRole)
    }

    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~~~~ SAVE OBJECTS ~~~~~~~~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def saveObject(object) {
        if (!object.save(flush:true)) {
            object.errors.allErrors.each { println it }
        }
    }
}
