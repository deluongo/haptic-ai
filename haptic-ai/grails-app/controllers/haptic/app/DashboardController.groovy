package haptic.app

import grails.plugin.springsecurity.annotation.Secured

@Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
class DashboardController {

    def index() {

        /*  --------------            *** Display Dashboard ***         ---------------  */
        render(view: "index", model: [])
    }

}
