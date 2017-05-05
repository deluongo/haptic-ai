package haptic.crm

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import haptic.eval.Note
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import haptic.join.Employee_Team
import haptic.org.PrivateDetails
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Contact)
@Mock([EmailAddress, PhoneNumber, SocialNetwork, WebSite, Address, ReviewSite, Note ])
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


    @Unroll
    void "test Request nullable parameters event: #event requestedSpace: #requestedSpace dateRequested: #dateRequested messages: #messages status: #status is valid: #result"() {

        when:
        Contact contact = new Contact(salutation: 'Mr.', firstName: 'Steve2', lastName: 'Jobs', gender: 'M',
                jobRole: 'Management', jobTitle: 'CTO', roleDescription: 'Description', department: 'Dept.',
                neuralNetValue: "\$234")


        then:
        contact.validate() == result

        where:
        phoneNumbers      |   emailAddresses      |   addresses          |   notes           |   reviewSites |   status                          |   result
        new PhoneNumber() |   new EmailAddress()  |   new Address()      |   new Note()      |   []          |   Request.RequestStatus.Approved  |   true
        null              |   new EmailAddress()  |   new Address()      |   new Note()      |   []          |   Request.RequestStatus.Approved  |   false
        new PhoneNumber() |   null                |   new Address()      |   new Note()      |   []          |   Request.RequestStatus.Approved  |   false
        new PhoneNumber() |   new EmailAddress()  |   null               |   new Note()      |   []          |   Request.RequestStatus.Approved  |   false
        new PhoneNumber() |   new EmailAddress()  |   new Address()      |   null            |   []          |   Request.RequestStatus.Approved  |   false
        new PhoneNumber() |   new EmailAddress()  |   new Address()      |   new Note()      |   null        |   Request.RequestStatus.Approved  |   false
        new PhoneNumber() |   new EmailAddress()  |   new Address()      |   new Note()      |   []          |   null                            |   false
    }
}
