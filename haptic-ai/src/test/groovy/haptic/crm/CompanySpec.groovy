package haptic.crm

import grails.test.mixin.TestFor
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Company)
class CompanySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test email formula not blank"() {
        when:"Email formula blank"
            Company testCompany = new Company(  emailFormula: '',
                                                emailAddresses: new HashSet<EmailAddress>(),
                                                phoneNumbers: new HashSet<PhoneNumber>(),
                                                socialNetworks: new HashSet<SocialNetwork>(),
                                                reviewSites: new HashSet<ReviewSite>(),
                                                webSites: new HashSet<WebSite>(),
                                                addresses: new HashSet<Address>())

        then:"Fail validation"
            !testCompany.validate()
    }
}
