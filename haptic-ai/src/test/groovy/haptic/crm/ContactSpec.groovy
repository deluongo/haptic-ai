package haptic.crm

import grails.test.mixin.TestFor
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import haptic.join.Employee_Team
import haptic.org.PrivateDetails
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Contact)
class ContactSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test salutation is valid"() {
        when: "Salutation is invalid"
            Contact testContact = new Contact(      salutation: '',
                                                    firstName: 'Bob',
                                                    lastName: 'Joe',
                                                    gender: 'M',
                                                    jobTitle: 'Sales Rep',
                                                    roleName: 'Role',
                                                    group: 'Group',
                                                    company: new Company(),
                                                    emailAddresses: new HashSet<EmailAddress>(),
                                                    phoneNumbers: new HashSet<PhoneNumber>(),
                                                    socialNetworks: new HashSet<SocialNetwork>(),
                                                    reviewSites: new HashSet<ReviewSite>(),
                                                    webSites: new HashSet<WebSite>(),
                                                    addresses: new HashSet<Address>())

        then: "Fail validation"
            !testContact.validate()
    }
}
