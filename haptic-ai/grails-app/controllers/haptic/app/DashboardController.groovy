package haptic.app

import grails.plugin.springsecurity.annotation.Secured
import haptic.crm.Lead
import haptic.fields.EmailAddress


@Secured([Role.ROLE_USER, Role.ROLE_ADMIN, Role.ROLE_ANONYMOUS])
class DashboardController {

    def index() {

        def leads = Lead.getAll()

        /*  --------------            *** Display Dashboard ***         ---------------  */
        render(view: 'index', model: [leads: leads])
    }

    /*
    *  Fields below needed for following method
    * */
    String emailAddress = '';
    String emailType = '';
    String emailStatus = '';

    def newEmail() {

        if (params.name=='emailAddress') {
            emailAddress = params['value'];
            println(emailAddress)
        }

        if (params.name=='emailType') {
            emailType = params['value[]'];
            println(emailType)
        }

        if (params.name=='emailStatus') {
            emailStatus = params['value[]'];
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

}
