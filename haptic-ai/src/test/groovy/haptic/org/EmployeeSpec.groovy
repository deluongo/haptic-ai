package haptic.org

import grails.test.mixin.TestFor
import haptic.app.User
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import haptic.join.Employee_Team
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Employee)
class EmployeeSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test salutations"() {
        when:"Salutation is not Mr, Mrs, Ms, Dr"
            Employee testEmployee = new Employee(   user: new User(),
                                                    salutation: '',
                                                    firstName: 'Bob',
                                                    lastName: 'Joe',
                                                    gender: 'M',
                                                    jobTitle: 'Sales Rep',
                                                    employeeDetails: new PrivateDetails(),
                                                    team: new Employee_Team(),
                                                    emailAddresses: new HashSet<EmailAddress>(),
                                                    phoneNumbers: new HashSet<PhoneNumber>(),
                                                    socialNetworks: new HashSet<SocialNetwork>(),
                                                    reviewSites: new HashSet<ReviewSite>(),
                                                    webSites: new HashSet<WebSite>(),
                                                    addresses: new HashSet<Address>())
        then:"Fail validation"
            !testEmployee.validate()

    }

    void "Test firstName not blank"()  {
        when: "The first name is blank"
            Employee testEmployee = new Employee(   user: new User(),
                                                    salutation: 'Mr.',
                                                    firstName: '',
                                                    lastName: 'Joe',
                                                    gender: 'M',
                                                    jobTitle: 'Sales Rep',
                                                    employeeDetails: new PrivateDetails(),
                                                    team: new Employee_Team(),
                                                    emailAddresses: new HashSet<EmailAddress>(),
                                                    phoneNumbers: new HashSet<PhoneNumber>(),
                                                    socialNetworks: new HashSet<SocialNetwork>(),
                                                    reviewSites: new HashSet<ReviewSite>(),
                                                    webSites: new HashSet<WebSite>(),
                                                    addresses: new HashSet<Address>())

        then: "Fail validation"
            !testEmployee.validate()
    }

    void "Test lastName not blank"()  {
        when: "The last name is blank"
            Employee testEmployee = new Employee(   user: new User(),
                                                    salutation: 'Mr.',
                                                    firstName: 'Bob',
                                                    lastName: '',
                                                    gender: 'M',
                                                    jobTitle: 'Sales Rep',
                                                    employeeDetails: new PrivateDetails(),
                                                    team: new Employee_Team(),
                                                    emailAddresses: new HashSet<EmailAddress>(),
                                                    phoneNumbers: new HashSet<PhoneNumber>(),
                                                    socialNetworks: new HashSet<SocialNetwork>(),
                                                    reviewSites: new HashSet<ReviewSite>(),
                                                    webSites: new HashSet<WebSite>(),
                                                    addresses: new HashSet<Address>())

        then: "Fail validation"
            !testEmployee.validate()
    }

    void "Test gender not blank"()  {
        when: "The gender is blank"
            Employee testEmployee = new Employee(   user: new User(),
                                                    salutation: 'Mr.',
                                                    firstName: 'Bob',
                                                    lastName: 'Joe',
                                                    gender: '',
                                                    jobTitle: 'Sales Rep',
                                                    employeeDetails: new PrivateDetails(),
                                                    team: new Employee_Team(),
                                                    emailAddresses: new HashSet<EmailAddress>(),
                                                    phoneNumbers: new HashSet<PhoneNumber>(),
                                                    socialNetworks: new HashSet<SocialNetwork>(),
                                                    reviewSites: new HashSet<ReviewSite>(),
                                                    webSites: new HashSet<WebSite>(),
                                                    addresses: new HashSet<Address>())

        then: "Fail validation"
            !testEmployee.validate()
    }

    void "Test jobTitle not blank"()  {
        when: "The jobTitle is blank"
            Employee testEmployee = new Employee(   user: new User(),
                                                    salutation: 'Mr.',
                                                    firstName: 'Bob',
                                                    lastName: 'Joe',
                                                    gender: 'M',
                                                    jobTitle: '',
                                                    employeeDetails: new PrivateDetails(),
                                                    team: new Employee_Team(),
                                                    emailAddresses: new HashSet<EmailAddress>(),
                                                    phoneNumbers: new HashSet<PhoneNumber>(),
                                                    socialNetworks: new HashSet<SocialNetwork>(),
                                                    reviewSites: new HashSet<ReviewSite>(),
                                                    webSites: new HashSet<WebSite>(),
                                                    addresses: new HashSet<Address>())

        then: "Fail validation"
            !testEmployee.validate()
    }




}
