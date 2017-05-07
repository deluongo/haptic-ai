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
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Company)
@Mock([EmailAddress, PhoneNumber, SocialNetwork, WebSite, Address, ReviewSite, Note, Contact])
class CompanySpec extends Specification {

    def setup() {

    }

    def cleanup() {
    }

    void "Test email formula not blank"() {
        when:"Email formula blank"
            Company testCompany = new Company(  companyName: '',
                                                emailAddresses: new HashSet<EmailAddress>(),
                                                phoneNumbers: new HashSet<PhoneNumber>(),
                                                socialNetworks: new HashSet<SocialNetwork>(),
                                                reviewSites: new HashSet<ReviewSite>(),
                                                webSites: new HashSet<WebSite>(),
                                                addresses: new HashSet<Address>())

        then:"Fail validation"
            !testCompany.validate()
    }

    @Unroll
    void "test Company nullable parameters phoneNumbers: #phoneNumbers emailAddresses: #emailAddresses addresses: #addresses notes: #notes contacts: #contacts is valid: #result"() {

        when:
        Company company = new Company(companyName: 'Apple', companyRevenue: "10 bil", marketVertical: "Tech")
        //apple.save(flush: true)


        then:
        company.validate() == result

        where:
        phoneNumbers      |   emailAddresses     |   addresses     |   notes      |   contacts                        |   result
        new PhoneNumber() |   new EmailAddress() |   new Address() |   new Note() |   [new Contact(), new Contact()]  |   false
        null              |   new EmailAddress() |   new Address() |   new Note() |   [new Contact(), new Contact()]  |   false
        new PhoneNumber() |   null               |   new Address() |   new Note() |   [new Contact()]                 |   false
        new PhoneNumber() |   new EmailAddress() |   null          |   new Note() |   [new Contact()]                 |   false
        new PhoneNumber() |   new EmailAddress() |   new Address() |   null       |   []                              |   false
        new PhoneNumber() |   new EmailAddress() |   new Address() |   new Note() |   null                            |   false
        new PhoneNumber() |   new EmailAddress() |   new Address() |   new Note() |   []                              |   false
    }
}
