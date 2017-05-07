package haptic.crm

import grails.test.mixin.TestFor
import haptic.connect.Communication
import haptic.eval.Action
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import haptic.org.Employee
import haptic.crm.Company
import spock.lang.Specification
import spock.lang.Unroll
import grails.test.mixin.Mock


/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Lead)
@Mock([Action, Communication, Company, Employee])
class LeadSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }



    void "test findAllContactsByLead" () {
        when:
        // Emails
        EmailAddress email1 = new EmailAddress(emailType: 'Primary', emailAddress: 'bill@microsoft.com', emailExtension: '@microsoft.com', emailStatus: 'Active', dateCreated: new Date())
        EmailAddress email2 = new EmailAddress(emailType: 'Primary', emailAddress: 'steve@apple.com', emailExtension: '@apple.com', emailStatus: 'Active', dateCreated: new Date())
        EmailAddress email3 = new EmailAddress(emailType: 'Primary', emailAddress: 'bill2@microsoft.com', emailExtension: '@microsoft.com', emailStatus: 'Active', dateCreated: new Date())
        EmailAddress email4 = new EmailAddress(emailType: 'Primary', emailAddress: 'steve2@apple.com', emailExtension: '@apple.com', emailStatus: 'Active', dateCreated: new Date())

        // Phone Numbers
        PhoneNumber phone1 = new PhoneNumber(phoneType: 'Home', phoneNumber: '650-540-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone2 = new PhoneNumber(phoneType: 'Home', phoneNumber: '+1 334-540-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone3 = new PhoneNumber(phoneType: 'Home', phoneNumber: '650-540-9464', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone4 = new PhoneNumber(phoneType: 'Home', phoneNumber: '950-640-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone5 = new PhoneNumber(phoneType: 'Home', phoneNumber: '888-540-9234', phoneStatus: 'Active', dateCreated: new Date())

        // Social Networks
        SocialNetwork sn1 = new SocialNetwork(networkName: "Facebook", networkUrl: "http://www.facebook.com", socialNetworkHandle: "Devon Luongo")
        SocialNetwork sn2 = new SocialNetwork(networkName: "Twitter", networkUrl: "http://www.twitter.com", socialNetworkHandle: "BillGatesDAlegend")
        SocialNetwork sn3 = new SocialNetwork(networkName: "LinkedIn", networkUrl: "http://www.linkedin.com", socialNetworkHandle: "SteveJobsRIP")

        // Websites
        WebSite web1 = new WebSite(webSiteName: "Google", webSiteType: "Company Site", webSiteUrl: "http://www.google.com")

        // Review Sites
        ReviewSite review1 = new ReviewSite(reviewSiteName: "G2 Crowd", reviewSiteUrl: "http://www.g2crowd.com", reviewSiteHandle: "deluongo")

        // Addresses
        Address address1 = new Address(locName: "Corporate Headquarters", locType: "Main Office", street: "999 Microsoft Dr.", city: "Wiscogi", state: "Washington", country: "United States", zip: "94999")
        Address address2 = new Address(locName: "Main Campus", locType: "Home", street: "999 Microsoft Dr.", city: "Wiscogi", state: "Washington", country: "United States", zip: "94999")
        Address address3 = new Address(locName: "Secret Offshore Base", locType: "Main Office", street: "Nowhere Dr.", city: "San Francisco", state: "California", country: "United States", zip: "94999")

        //Contacts
        Contact billGates = new Contact(salutation: 'Mr.', firstName: 'Bill', lastName: 'Gates', gender: 'Male',
                jobRole: 'Customer Support', jobTitle: 'CEO', roleDescription: 'Description', department: 'Support',
                emailAddresses: [email1, email3], neuralNetValue: "\$1,434", phoneNumbers: [phone1, phone2, phone3], addresses: [address2, address3],
                reviewSites: [review1], socialNetworks: [sn1, sn2, sn3], webSites: [web1])
        Contact billGates2 = new Contact(salutation: 'Mr.', firstName: 'Cill2', lastName: 'Gates', gender: 'Male',
                jobRole: 'Software Engineering', jobTitle: 'C-Level Executive', roleDescription: 'Description', department: 'Engineering',
                emailAddresses: [email3], neuralNetValue: "\$734",  phoneNumbers: [phone3, phone5], addresses: [address1], reviewSites: [review1], socialNetworks: [sn1], webSites: [web1])
        Contact steveJobs = new Contact(salutation: 'Mr.', firstName: 'Steve', lastName: 'Jobs', gender: 'Male',
                jobRole: 'Account Management', jobTitle: 'CEO', roleDescription: 'Description', department: 'Sales',
                emailAddresses: [email2, email4], neuralNetValue: "\$434", phoneNumbers: [phone4], addresses: [address2, address3], reviewSites: [review1], socialNetworks: [sn1, sn2, sn3], webSites: [web1])
        Contact steveJobs2 = new Contact(salutation: 'Mr.', firstName: 'Steve2', lastName: 'Jobs', gender: 'Male',
                jobRole: 'Product Marketing', jobTitle: 'CTO', roleDescription: 'Description', department: 'Marketing',
                emailAddresses: [email4], neuralNetValue: "\$234")

        // Companies
        Company microsoft = new Company(companyName: 'Microsoft', companyRevenue: "6 bil", marketVertical: "Tech")
        Company apple = new Company(companyName: 'Apple', companyRevenue: "10 bil", marketVertical: "Tech")

        // Employees
        Employee devon = Employee.findAllByFirstName("Devon")[0]

        // Leads
        Lead lead1 = new Lead(status: 'Status 1', leadStatus: 'Qualified', leadStage: 'MQL', budget: 'Yes', leadOwner: devon,
                auth: 'Yes', need: 'Yes', timing: 'Yes', budgetDetails: 'budgetDetails1',
                authorityDetails: 'authDetails1', needDetails: 'needDetails1', timingDetails: new Date(),
                estimatedDealSize: 3450, dateOpened: new Date(), dateClosed: new Date(), company: microsoft)

        then:

        lead1.status == 'Status 1'
        // WHY
    }





}
