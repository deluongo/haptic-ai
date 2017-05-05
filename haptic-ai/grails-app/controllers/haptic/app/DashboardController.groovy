package haptic.app

import grails.plugin.springsecurity.annotation.Secured
import haptic.crm.Contact
import haptic.crm.Lead
import haptic.fields.EmailAddress
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional



@Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
class DashboardController {

    def springSecurityService

    def index() {

        def leads = Lead.getAll()
        print(leads)

        // Toggles Welcome Message
        def lead = null


        /*  --------------            *** Display Dashboard ***         ---------------  */
        render(view: "index", model: ["leads": leads, "lead": lead])
    }

    /*
     *  Fields below needed for following method
     * */
    String emailAddress = ''
    String emailType = ''
    String emailStatus = ''

    def newEmail() {

        if (params.name=='emailAddress') {
            emailAddress = params['value']
            println(emailAddress)
        }

        if (params.name=='emailType') {
            emailType = params['value[]']
            println(emailType)
        }

        if (params.name=='emailStatus') {
            emailStatus = params['value[]']
            println(emailStatus)
        }

        println('Params: '+params)
        println('Address: '+emailAddress)
        println('Type: '+emailType)
        println('Status: '+emailStatus)


        if (emailAddress!='' && emailType!='' && emailStatus!='') {
            String extension = '@'+emailAddress.split('@')[1]
            println(extension)

            EmailAddress newEmail = new EmailAddress(emailAddress: emailAddress, emailType: emailType,
                    emailStatus: emailStatus, emailExtension: extension, dateCreated: new Date())

            newEmail.save(flush: true)
            emailAddress = ''
            emailType = ''
            emailStatus = ''

        }

        render(emailAddress+' '+emailType+' '+emailStatus)
    }


    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~ SHOW PLAYER STATS ~~~~~~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def viewLead() {
        //String personIndex, String tabIndex, String postTitle, String postDescription, String backgroundImage, String blogText

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> SHOW PLAYER STATS!
        * ===========================================
        * INPUTS:
        *     -
        * FUNCTIONS:
        *     - playGame(homeTeam, awayTeam)
        * DESCRIPTION:
        *     - Displays league standings in the browser
        * OUTPUT:
        *     -
        /*---------------------------------------------------------------------------------------------*/

        def leadIndex = params.list('leadIndex') ?: 1
        def contactIndex = params.list('contactIndex') ?: 1
        //def validation_error = []
        //String personIndex, String tabIndex,

        /*  --------------              *** Select Player ***           ---------------  */
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."



        //println(lead)


        def lead = Lead.get(leadIndex)


        /*  --------------            *** Authenticate User ***         ---------------  */
        def currentUser = springSecurityService?.currentUser ?: "User Not Configured"
        /*
        if(person.user != currentUser) {

            flash.message = "You aren't authorized to create new blog posts for ${person.firstName} ${person.lastName}"
        }
        */


        /*  --------------            *** Load Form Results ***         ---------------  */
        def leadCompany = lead.company
        def activeContact = Contact.get(contactIndex)
        def allContacts = leadCompany.contacts.sort()


        println("\n\n\n" + " ----------- LEAD ------------- \n")
        print(contactIndex)
        print(activeContact?.firstName)
        println(lead?.leadStatus)
        println(allContacts)
        println("\n" + " ----------- LEAD -------------" + "\n\n\n")


        /*
        def leadTimeLine = lead.timeLine
        def leadActivityFeed = lead.activityFeed
        */
        //def backgroundImage = params.list('backgroundImage')


        /*  --------------              *** Display Stats ***           ---------------  */

        render(template: "/sharedTemplates/jqueryRenders/contacts", model: [lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts])

    }

    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~ SHOW PLAYER STATS ~~~~~~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def activityModals() {
        //String personIndex, String tabIndex, String postTitle, String postDescription, String backgroundImage, String blogText

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> SHOW PLAYER STATS!
        * ===========================================
        * INPUTS:
        *     -
        * FUNCTIONS:
        *     - playGame(homeTeam, awayTeam)
        * DESCRIPTION:
        *     - Displays league standings in the browser
        * OUTPUT:
        *     -
        /*---------------------------------------------------------------------------------------------*/

        def leadIndex = params.list('leadIndex') ?: 1
        def contactIndex = params.list('contactIndex') ?: 1
        //def validation_error = []
        //String personIndex, String tabIndex,

        /*  --------------              *** Select Player ***           ---------------  */
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."



        //println(lead)


        def lead = Lead.get(leadIndex)


        /*  --------------            *** Authenticate User ***         ---------------  */
        def currentUser = springSecurityService?.currentUser ?: "User Not Configured"
        /*
        if(person.user != currentUser) {

            flash.message = "You aren't authorized to create new blog posts for ${person.firstName} ${person.lastName}"
        }
        */


        /*  --------------            *** Load Form Results ***         ---------------  */
        def leadCompany = lead.company
        def activeContact = Contact.get(contactIndex)
        def allContacts = leadCompany.contacts.sort()


        println("\n\n\n" + " ----------- LEAD ------------- \n")
        print(contactIndex)
        print(activeContact.firstName)
        println(lead.leadStatus)
        println(allContacts)
        println("\n" + " ----------- LEAD -------------" + "\n\n\n")


        /*
        def leadTimeLine = lead.timeLine
        def leadActivityFeed = lead.activityFeed
        */
        //def backgroundImage = params.list('backgroundImage')


        /*  --------------              *** Display Stats ***           ---------------  */

        render(template: "/sharedTemplates/modals/new-email-modal", model: [lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts])

    }


    /*
    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    */
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~ SHOW PLAYER STATS ~~~~~~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    /*
    def viewLeadContacts() {
        print("HI")
        //String personIndex, String tabIndex, String postTitle, String postDescription, String backgroundImage, String blogText

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> SHOW PLAYER STATS!
        * ===========================================
        * INPUTS:
        *     -
        * FUNCTIONS:
        *     - playGame(homeTeam, awayTeam)
        * DESCRIPTION:
        *     - Displays league standings in the browser
        * OUTPUT:
        *     -
        /*---------------------------------------------------------------------------------------------*/

        /*
        def leadIndex = params.list('leadIndex')
        //def validation_error = []
        //String personIndex, String tabIndex,

        /*  --------------              *** Select Player ***           ---------------  */

        /*
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."

        println("LEAD ------------- \n\n\n\n\n")
        print(params)
        println("LEAD ------------- \n\n\n\n\n")

        //println(lead)
        println(leadIndex[0])

        def lead = Lead.get("${leadIndex[0]}")


        /*  --------------            *** Authenticate User ***         ---------------  */

        /*
        def currentUser = springSecurityService?.currentUser ?: "User Not Configured"

        /*
        if(person.user != currentUser) {

            flash.message = "You aren't authorized to create new blog posts for ${person.firstName} ${person.lastName}"
        }
	    */

        /*
        def active_contact_idx = 0
        /*  --------------            *** Load Form Results ***         ---------------  */

        /*
        def leadCompany = lead.company
        def activeContact = leadCompany.contacts[active_contact_idx]
        def allContacts = leadCompany.contacts

        /*
        def leadTimeLine = lead.timeLine
        def leadActivityFeed = lead.activityFeed
        */
        //def backgroundImage = params.list('backgroundImage')


        /*  --------------              *** Display Stats ***           ---------------  */
        /*
        render(template: "/sharedTemplates/jqueryRenders/contacts", model: [lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts])

    }



        /*
        @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
        */
        /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
         *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~ SHOW PLAYER STATS ~~~~~~~~~~~
         *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        /*
        def viewLeadCompany() {
            print("HI")
            //String personIndex, String tabIndex, String postTitle, String postDescription, String backgroundImage, String blogText
            */

}
