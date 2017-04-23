package haptic.crm

import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite

class Company {


    /*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [emailAddresses: EmailAddress, phoneNumbers: PhoneNumber,
                      socialNetworks: SocialNetwork, reviewSites: ReviewSite, webSites: WebSite,
                      addresses     : Address]

    static constraints = {
    }
}
