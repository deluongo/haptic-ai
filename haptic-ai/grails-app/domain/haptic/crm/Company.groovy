package haptic.crm

import haptic.eval.Note
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite


/*                          ==============  ***  ==============                          *
 #  ---------------------        Class ~Company~ Definition        --------------------  #
 *                          ===================================                          */


class Company {


/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String companyName
    String companyRevenue
    String marketVertical

    String emailFormula

    Lead lead
    //static belongsTo = [lead: Lead]



/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [contacts: Contact, emailAddresses: EmailAddress, phoneNumbers: PhoneNumber,
                      socialNetworks: SocialNetwork, reviewSites: ReviewSite, webSites: WebSite,
                      addresses     : Address, notes: Note]

    static constraints = {
        emailFormula nullable: true
        emailAddresses nullable: true
        phoneNumbers nullable: true
        socialNetworks nullable: true
        reviewSites nullable: true
        webSites nullable: true
        addresses nullable: true
        notes nullable: true
    }



}


