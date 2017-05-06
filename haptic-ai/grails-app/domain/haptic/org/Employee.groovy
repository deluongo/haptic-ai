package haptic.org
import haptic.app.User
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import haptic.join.Employee_Team

/*                          ==============  ***  ==============                          *
 #  ---------------------       Class ~Employee~ Definition        --------------------  #
 *                          ===================================                          */

class Employee {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */

    // Fixed Fields
    String salutation //Mr., Mrs., etc.
    String firstName
    String lastName
    String gender
    String jobTitle
    PrivateDetails employeeDetails
    Team team//Employee_Team is customer pivot table
    //User user

/*  -------------------             *** GORM Mapping ***            -------------------  */

    /*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [emailAddresses: EmailAddress, phoneNumbers: PhoneNumber,
                      socialNetworks: SocialNetwork, reviewSites: ReviewSite, webSites: WebSite,
                      addresses     : Address]

    //TO-DO:
    //------
    //Fix GORM Mappings

    static belongsTo = [user: User]




/*  -------------------              *** Constraints ***            -------------------  */
    static constraints = {
        salutation inList: ['Mr.', 'Mrs.', 'Ms.', 'Dr.']
        firstName blank: false
        gender blank: false
        jobTitle blank: false
        team nullable: true
        employeeDetails nullable: true
        emailAddresses nullable: true
        phoneNumbers nullable: true
        socialNetworks nullable: true
        reviewSites nullable: true
        webSites nullable: true
        addresses nullable: true
    }

/*  -------------------          *** Database Designations ***      -------------------  */
    static mapping = {

    }

/*  -------------------             *** List Transients ***         -------------------  */
    static transients = [
            /* ___  security  ___ */

    ]
/*  -------------------           *** Transient Functions ***       -------------------  */


}
