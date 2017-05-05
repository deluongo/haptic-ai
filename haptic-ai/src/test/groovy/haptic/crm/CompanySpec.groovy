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

    @Unroll
    void "test Request nullable parameters event: #event requestedSpace: #requestedSpace dateRequested: #dateRequested messages: #messages status: #status is valid: #result"() {

        when:
        Company company = new Company(companyName: 'Apple', companyRevenue: "10 bil", marketVertical: "Tech")
        //apple.save(flush: true)


        then:
        company.validate() == result

        where:
        phoneNumbers      |   emailAddresses     |   addresses     |   notes      |   contacts                        |   status                         |   result
        new PhoneNumber() |   new EmailAddress() |   new Address() |   new Note() |   [new Contact(), new Contact()]  |   Request.RequestStatus.Approved |   true
        null              |   new EmailAddress() |   new Address() |   new Note() |   [new Contact(), new Contact()]  |   Request.RequestStatus.Approved |   false
        new PhoneNumber() |   null               |   new Address() |   new Note() |   [new Contact()]                 |   Request.RequestStatus.Approved |   false
        new PhoneNumber() |   new EmailAddress() |   null          |   new Note() |   [new Contact()]                 |   Request.RequestStatus.Approved |   false
        new PhoneNumber() |   new EmailAddress() |   new Address() |   null       |   []                              |   Request.RequestStatus.Approved |   false
        new PhoneNumber() |   new EmailAddress() |   new Address() |   new Note() |   null                            |   Request.RequestStatus.Approved |   false
        new PhoneNumber() |   new EmailAddress() |   new Address() |   new Note() |   []                              |   null                           |   false
    }
}
