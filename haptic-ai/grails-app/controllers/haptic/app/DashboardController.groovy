package haptic.app

import grails.plugin.springsecurity.annotation.Secured
import haptic.crm.Company
import haptic.crm.Contact
import haptic.crm.Lead
import haptic.fields.EmailAddress
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.SpringSecurityUtils


@Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
class DashboardController {

    def springSecurityService

    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    def index() {

        /*  --------------            *** Authenticate User ***         ---------------  */
        def currentUser = springSecurityService?.currentUser ?: "User Not Configured"

        def leads = Lead.getAll()
        print(leads)

        // Toggles Welcome Message
        def lead = null


        /*  --------------            *** Display Dashboard ***         ---------------  */
        render(view: "index", model: ["leads": leads, "lead": lead, currentUser: currentUser])
    }

    /*
     *  Fields below needed for following method
     * */
    String emailAddress = ''
    String emailType = ''
    String emailStatus = ''

    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN])
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


    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~ SHOW PLAYER STATS ~~~~~~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def viewLead() {

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> UPDATES DASHBOARD PAGE CONTENT!
        * ===========================================
        * INPUTS:
        *     - leadIndex
        *     - contactIndex
        * DESCRIPTION:
        *     - Displays lead related contact data via ajax render
        * OUTPUT:
        *     - HTML rendering of _contacts.gsp template
        /*---------------------------------------------------------------------------------------------*/

        // Authenticate User
        def currentUser = springSecurityService?.currentUser ?: "User Not Configured"

        // Get indices from post params
        def leadIndex = params.list('leadIndex')

        // Define flash message
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."

        // Get domain class objects from indices
        def lead = Lead.get(leadIndex)
        def leadCompany = lead.company
        def allContacts = lead.rankedContacts
        def activeContact = allContacts[0]


        /*
        def leadTimeLine = lead.timeLine
        def leadActivityFeed = lead.activityFeed
        */
        //def backgroundImage = params.list('backgroundImage')

        // Tests
        println("\n\n\n" + " ----------- VIEW LEAD ------------- \n")
        print(activeContact?.firstName)
        println(lead?.leadStatus)
        println(allContacts)
        println("\n" + " ----------- LEAD -------------" + "\n\n\n")





        /*  --------------              *** Display Stats ***           ---------------  */

        render(template: "/sharedTemplates/jqueryRenders/contacts", model: [lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts,  currentUser: currentUser])

    }


    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~ SHOW PLAYER STATS ~~~~~~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def updateContact() {

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> UPDATES DASHBOARD PAGE CONTENT!
        * ===========================================
        * INPUTS:
        *     - leadIndex
        *     - contactIndex
        * DESCRIPTION:
        *     - Displays lead related contact data via ajax render
        * OUTPUT:
        *     - HTML rendering of _contacts.gsp template
        /*---------------------------------------------------------------------------------------------*/

        // Authenticate User
        def currentUser = springSecurityService?.currentUser ?: "User Not Configured"

        // Get indices from post params
        def leadIndex = params.list('leadIndex') //?: 1
        def contactIndex = params.list('contactIndex')

        // Define flash message
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."

        // Get domain class objects from indices
        def lead = Lead.get(leadIndex)
        def leadCompany = lead.company
        def activeContact = Contact.get(contactIndex)
        def allContacts = lead.rankedContacts


        /*
        def leadTimeLine = lead.timeLine
        def leadActivityFeed = lead.activityFeed
        */
        //def backgroundImage = params.list('backgroundImage')

        // Tests
        println("\n\n\n" + " ----------- UPDATE ------------- \n")
        print(contactIndex)
        print(activeContact?.firstName)
        println(lead?.leadStatus)
        println(allContacts)
        println("\n" + " ----------- UPDATE -------------" + "\n\n\n")





        /*  --------------              *** Display Stats ***           ---------------  */

        render(template: "/sharedTemplates/jqueryRenders/contacts", model: [lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts, currentUser: currentUser])

    }

    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN])
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

        render(template: "/sharedTemplates/modals/new-email-modal", model: [lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts, currentUser: currentUser])

    }



    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~ UPDATE CONTACT'S SALUTATION ~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def salutations_temp() {

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> UPDATES CONTACT'S SALUTATION FIELD IN DB!
        * ===========================================
        * INPUTS:
        *     - contactIndex
        *     - leadIndex
        *     - salutationValue
        * DESCRIPTION:
        *     - Stores results for x-editable form in DB
        * OUTPUT:
        *     - HTML rendering of _contacts.gsp template
        /*---------------------------------------------------------------------------------------------*/

        // Authenticate User
        //def currentUser = springSecurityService?.currentUser ?: "User Not Configured"

        // Get indices from post params
        //def leadIndex = params.list('leadIndex') ?: 1
        def contactIndex = params.list('pk')
        def salutationValue = params.list('value')


        println("\n\n\n" + " ----------- SALUTATION ------------- \n")
        print(contactIndex)
        print(salutationValue)
        println("\n" + " ----------- SALUTATION -------------" + "\n\n\n")

        // Define flash message
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."

        // Get domain class objects from indices
        //def lead = Lead.get(leadIndex)
        //def leadCompany = lead.company
        def activeContact = Contact.get(contactIndex)
        //def allContacts = leadCompany.contacts.sort()

        // Store updated salutation value
        activeContact.salutation = salutationValue
        activeContact.save(flush:true)


        render(template: "/sharedTemplates/modals/new-email-modal", model: [lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts])

    }




    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~ UPDATE CONTACT'S SALUTATION ~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def firstName() {

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> UPDATES CONTACT'S SALUTATION FIELD IN DB!
        * ===========================================
        * INPUTS:
        *     - contactIndex
        *     - leadIndex
        *     - salutationValue
        * DESCRIPTION:
        *     - Stores results for x-editable form in DB
        * OUTPUT:
        *     - HTML rendering of _contacts.gsp template
        /*---------------------------------------------------------------------------------------------*/

        // Authenticate User
        //def currentUser = springSecurityService?.currentUser ?: "User Not Configured"

        // Get indices from post params
        //def leadIndex = params.list('leadIndex') ?: 1
        def contactIndex = params.list('pk')[0]
        def leadIndex = params.list('lead')[0]
        def salutationValue = params.list('value')[0]


        println("\n\n\n" + " ----------- SALUTATION ------------- \n")
        println(contactIndex)
        println(salutationValue)
        println("\n")
        print(leadIndex)
        println("\n" + " ----------- SALUTATION -------------" + "\n\n\n")

        // Define flash message
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."

        // Get domain class objects from indices
        //def lead = Lead.get(leadIndex)
        //def leadCompany = lead.company
        def activeContact = Contact.get(contactIndex)
        //def allContacts = leadCompany.contacts.sort()

        // Store updated salutation value
        activeContact.firstName = salutationValue
        activeContact.save(flush:true)


        return "HTTP status 200 OK"

    }


    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~ UPDATE CONTACT'S SALUTATION ~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def storeEditable() {

        /*------------------------------------------*
        * ===========================================
        * FUNCTION -> UPDATES CONTACT'S SALUTATION FIELD IN DB!
        * ===========================================
        * INPUTS:
        *     - contactIndex
        *     - leadIndex
        *     - salutationValue
        * DESCRIPTION:
        *     - Stores results for x-editable form in DB
        * OUTPUT:
        *     - HTML rendering of _contacts.gsp template
        /*---------------------------------------------------------------------------------------------*/

        // Authenticate User
        //def currentUser = springSecurityService?.currentUser ?: "User Not Configured"

        // Get indices from post params
        //def leadIndex = params.list('leadIndex') ?: 1
        def contactIndex = params.list('pk')[0]
        def leadIndex = params.list('lead')[0]
        def salutationValue = params.list('value')[0]
        def fieldName = params.list('name')[0]


        println("\n\n\n" + " ----------- SALUTATION ------------- \n")
        println(contactIndex)
        println(salutationValue)
        println("\n")
        print(leadIndex)
        println("\n" + " ----------- SALUTATION -------------" + "\n\n\n")

        // Define flash message
        flash.message = "We've hit a snag. Details of this lead can't be displayed. Please refresh and try again."

        // Get domain class objects from indices
        //def lead = Lead.get(leadIndex)
        //def leadCompany = lead.company
        def activeContact = Contact.get(contactIndex)
        //def allContacts = leadCompany.contacts.sort()

        // Store updated salutation value
        activeContact."${fieldName}" = salutationValue
        activeContact.save(flush:true)



        return "HTTP status 200 OK"

    }


    @Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~ UPDATE CONTACT'S SALUTATION ~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def companyList() {
        //Editable dropdown lists
        def company_dropdown = Company.getAll().sort{it.companyName}.companyName
        print(company_dropdown)


        print(company_json)
        //def ret = {"Microsoft": "Microsoft", "P&G": "Proctor & Gamble"}
        render company_json
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
