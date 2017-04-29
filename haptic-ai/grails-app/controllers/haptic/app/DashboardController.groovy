package haptic.app

import grails.plugin.springsecurity.annotation.Secured
import haptic.crm.Lead


@Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
class DashboardController {

    def index() {

        def leads = Lead.findAll()

        /*  --------------            *** Display Dashboard ***         ---------------  */
        render(view: "index", model: ["leads": leads])
    }

}
