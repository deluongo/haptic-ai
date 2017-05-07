package haptic.app

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import haptic.connect.Communication
import haptic.crm.Company
import haptic.crm.Contact
import haptic.crm.Lead
import haptic.eval.Action
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import haptic.org.Employee
import haptic.org.Team
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DashboardController)
@Mock([Action, Communication, Company, Employee, Lead, Contact, WebSite, PhoneNumber, Address, EmailAddress, SocialNetwork, ReviewSite, EmailAddress])
class DashboardControllerSpec extends Specification {

    def populateLeadParams(params) {
        params << [status: 'Status 1', leadStatus: 'Qualified', leadStage: 'MQL', budget: 'Yes', leadOwner: new Employee(),
                auth: 'Yes', need: 'Yes', timing: 'Yes', budgetDetails: 'budgetDetails1',
                authorityDetails: 'authDetails1', needDetails: 'needDetails1', timingDetails: new Date(),
                estimatedDealSize: 3450, dateOpened: new Date(), dateClosed: new Date(), company: new Company()]
        assert params != null
    }

    def populateContactParams(params) {
        params << [salutation: 'Mr.', firstName: 'Bill', lastName: 'Gates', gender: 'Male',
                jobRole: 'Customer Support', jobTitle: 'CEO', roleDescription: 'Description', department: 'Support',
                emailAddresses: [new EmailAddress(), new EmailAddress()], neuralNetValue: "\$1,434", phoneNumbers: [new PhoneNumber(), new PhoneNumber(), new PhoneNumber()], addresses: [new Address(), new Address()],
                reviewSites: [new ReviewSite()], socialNetworks: [new SocialNetwork(), new SocialNetwork(), new SocialNetwork()], webSites: [new WebSite()]]
        assert params != null
    }

    def populateUserParams(params) {
        params << [salutation: "Dr.", firstName: "Devon", lastName: "Luongo", gender: "Trans", jobTitle: "Loving Husband",
                   phoneNumbers: [new PhoneNumber(), new PhoneNumber(), new PhoneNumber()], addresses: [new Address(), new Address()],
                   reviewSites: [new ReviewSite()], socialNetworks: [new SocialNetwork(), new SocialNetwork(), new SocialNetwork()], webSites: [new WebSite()]]
        assert params != null

    }

    def populateCompanyParams(params) {
        params << [companyName: 'Microsoft', companyRevenue: "6 bil", marketVertical: "Tech", contacts: [new Contact(), new Contact(), new Contact(), new Contact()]]
        assert params != null
    }


    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
        populateLeadParams(params)
        def lead1 = new Lead(params)
        def lead2 = new Lead(params)
        def lead3 = new Lead(params)
        populateUserParams(params)
        def user = new User(params)

        def model = [lead: lead1, leads: [lead1, lead2, lead3], currentUser: user]
        controller.index()

        then:"The model is correct"
        model.leads instanceof ArrayList
    }

}
