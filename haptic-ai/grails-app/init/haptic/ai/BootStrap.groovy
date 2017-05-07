package haptic.ai

import haptic.app.UserRole
import haptic.app.User
import haptic.app.Role
import haptic.connect.Communication
import haptic.crm.Company
import haptic.crm.Contact
import haptic.crm.Lead
import haptic.fields.Address
import haptic.fields.EmailAddress
import haptic.fields.PhoneNumber
import haptic.fields.ReviewSite
import haptic.fields.SocialNetwork
import haptic.fields.WebSite
import haptic.org.Employee
import haptic.org.PrivateDetails
import haptic.org.Team

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                setupUsersAndRoles()
                setupDummyData()
            }
            test {
                //setupUsersAndRoles()
                setupDummyData()
            }
            production {
                // do nothing
            }
        }
    }
    def destroy = {
    }

    def setupDummyData() {
        // Emails
        EmailAddress email1 = new EmailAddress(emailType: 'Primary', emailAddress: 'bill@microsoft.com', emailExtension: '@microsoft.com',
                emailStatus: 'Active', dateCreated: new Date())



        EmailAddress email2 = new EmailAddress(emailType: 'Primary', emailAddress: 'steve@apple.com', emailExtension: '@apple.com',
                emailStatus: 'Active', dateCreated: new Date())



        EmailAddress email3 = new EmailAddress(emailType: 'Primary', emailAddress: 'bill2@microsoft.com', emailExtension: '@microsoft.com',
                emailStatus: 'Active', dateCreated: new Date())


        EmailAddress email4 = new EmailAddress(emailType: 'Primary', emailAddress: 'steve2@apple.com', emailExtension: '@apple.com',
                emailStatus: 'Active', dateCreated: new Date())



        PhoneNumber phone1 = new PhoneNumber(phoneType: 'Home', phoneNumber: '650-540-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone2 = new PhoneNumber(phoneType: 'Home', phoneNumber: '+1 334-540-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone3 = new PhoneNumber(phoneType: 'Home', phoneNumber: '650-540-9464', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone4 = new PhoneNumber(phoneType: 'Home', phoneNumber: '950-640-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone5 = new PhoneNumber(phoneType: 'Home', phoneNumber: '888-540-9234', phoneStatus: 'Active', dateCreated: new Date())


        SocialNetwork sn1 = new SocialNetwork(networkName: "Facebook", networkUrl: "http://www.facebook.com", socialNetworkHandle: "Devon Luongo")
        SocialNetwork sn2 = new SocialNetwork(networkName: "Twitter", networkUrl: "http://www.twitter.com", socialNetworkHandle: "BillGatesDAlegend")
        SocialNetwork sn3 = new SocialNetwork(networkName: "LinkedIn", networkUrl: "http://www.linkedin.com", socialNetworkHandle: "SteveJobsRIP")

        WebSite web1 = new WebSite(webSiteName: "Google", webSiteType: "Company Site", webSiteUrl: "http://www.google.com")

        ReviewSite review1 = new ReviewSite(reviewSiteName: "G2 Crowd", reviewSiteUrl: "http://www.g2crowd.com", reviewSiteHandle: "deluongo")

        Address address1 = new Address(locName: "Corporate Headquarters", locType: "Main Office", street: "999 Microsoft Dr.", city: "Wiscogi", state: "Washington", country: "United States", zip: "94999")
        Address address2 = new Address(locName: "Main Campus", locType: "Home", street: "999 Microsoft Dr.", city: "Wiscogi", state: "Washington", country: "United States", zip: "94999")
        Address address3 = new Address(locName: "Secret Offshore Base", locType: "Main Office", street: "Nowhere Dr.", city: "San Francisco", state: "California", country: "United States", zip: "94999")





        //lead2.save(flush: true)

        //print(Lead.getAll())

        //contacts: lead1HashSet, company: microsoft
        //contacts: lead2HashSet, company: apple




        //Contacts
        def billGates = new Contact(salutation: 'Mr.', firstName: 'Bill', lastName: 'Gates', gender: 'Male',
                jobRole: 'Customer Support', jobTitle: 'CEO', roleDescription: 'Description', department: 'Support',
                emailAddresses: [email1, email3], neuralNetValue: "\$1,434", phoneNumbers: [phone1, phone2, phone3], addresses: [address2, address3],
                reviewSites: [review1], socialNetworks: [sn1, sn2, sn3], webSites: [web1])
        def billGates2 = new Contact(salutation: 'Mr.', firstName: 'Bill2', lastName: 'Gates', gender: 'Male',
                jobRole: 'Software Engineering', jobTitle: 'C-Level Executive', roleDescription: 'Description', department: 'Engineering',
                emailAddresses: [email3], neuralNetValue: "\$734",  phoneNumbers: [phone3, phone5], addresses: [address1], reviewSites: [review1], socialNetworks: [sn1], webSites: [web1])
        //billGates.save(flush: true)
        //billGates2.save(flush: true)



        def steveJobs = new Contact(salutation: 'Mr.', firstName: 'Steve', lastName: 'Jobs', gender: 'Male',
                jobRole: 'Account Management', jobTitle: 'CEO', roleDescription: 'Description', department: 'Sales',
                emailAddresses: [email2, email4], neuralNetValue: "\$434", phoneNumbers: [phone4], addresses: [address2, address3], reviewSites: [review1], socialNetworks: [sn1, sn2, sn3], webSites: [web1])
        def steveJobs2 = new Contact(salutation: 'Mr.', firstName: 'Steve2', lastName: 'Jobs', gender: 'Male',
                jobRole: 'Product Marketing', jobTitle: 'CTO', roleDescription: 'Description', department: 'Marketing',
                emailAddresses: [email4], neuralNetValue: "\$234")
        //steveJobs.save(flush: true)
        //steveJobs2.save(flush: true)

        // Companies
        Company microsoft = new Company(companyName: 'Microsoft', companyRevenue: "6 bil", marketVertical: "Tech").addToContacts(billGates).addToContacts(billGates2)
        //microsoft.save(flush: true)

        Company apple = new Company(companyName: 'Apple', companyRevenue: "10 bil", marketVertical: "Tech").addToContacts(steveJobs).addToContacts(steveJobs2)
        //apple.save(flush: true)


        // Leads
        Employee devon = Employee.findAllByFirstName("Devon")[0]

        Lead lead1 = new Lead(status: 'Status 1', leadStatus: 'Qualified', leadStage: 'MQL', budget: 'Yes', leadOwner: devon,
                auth: 'Yes', need: 'Yes', timing: 'Yes', budgetDetails: 'budgetDetails1',
                authorityDetails: 'authDetails1', needDetails: 'needDetails1', timingDetails: new Date(),
                estimatedDealSize: 3450, dateOpened: new Date(), dateClosed: new Date(), company: microsoft).save(flush:true)


        //lead1.save(flush: true)

        Lead lead2 = new Lead(status: 'Status 2', leadStatus: 'Qualified', leadStage: 'MQL', budget: 'Yes', leadOwner: devon,
                auth: 'Yes', need: 'Yes', timing: 'Yes', budgetDetails: 'budgetDetails2',
                authorityDetails: 'authDetails2', needDetails: 'needDetails2', timingDetails: new Date(),
                estimatedDealSize: 5867, dateOpened: new Date(), dateClosed: new Date(), company: apple).save(flush:true)


        print(lead1.company.contacts)



        // Contacts
        HashSet<Contact> lead1HashSet = new HashSet<Contact>()
        lead1HashSet.add(billGates)
        lead1HashSet.add(billGates2)

        HashSet<Contact> lead2HashSet = new HashSet<Contact>()
        lead2HashSet.add(steveJobs)
        lead2HashSet.add(steveJobs2)


        //microsoft = Company.findAllByCompanyName('Microsoft')
        print(devon.firstName)
        print(microsoft)
        print("/n")
        print("/n")
        print(microsoft.companyName)



    }

    def setupUsersAndRoles() {

        // Emails
        EmailAddress email_mike = new EmailAddress(emailType: 'Primary', emailAddress: 'michael@g.harvard.edu', emailExtension: '@gmharvard.edu', emailStatus: 'Active', dateCreated: new Date())
        EmailAddress email_admin = new EmailAddress(emailType: 'Secondary', emailAddress: 'admin@hapticsales.com', emailExtension: '@hapticsales.com', emailStatus: 'Active', dateCreated: new Date())
        EmailAddress email_devon = new EmailAddress(emailType: 'Primary', emailAddress: 'del253@g.harvard.edu', emailExtension: '@g.harvard.edu', emailStatus: 'Active', dateCreated: new Date())
        EmailAddress email_user = new EmailAddress(emailType: 'Primary', emailAddress: 'anon56@g.harvard.edu', emailExtension: '@g.harvard.edu', emailStatus: 'Unsubscribed', dateCreated: new Date())

        PhoneNumber phone_mike = new PhoneNumber(phoneType: 'Cell', phoneNumber: '650-540-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone_admin = new PhoneNumber(phoneType: 'Work', phoneNumber: '+1 334-540-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone_user = new PhoneNumber(phoneType: 'Work', phoneNumber: '650-540-9464', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone_devon = new PhoneNumber(phoneType: 'Home', phoneNumber: '950-640-9234', phoneStatus: 'Active', dateCreated: new Date())
        PhoneNumber phone_haptic = new PhoneNumber(phoneType: 'Automated', phoneNumber: '888-540-9234', phoneStatus: 'Active', dateCreated: new Date())

        SocialNetwork sn_devon = new SocialNetwork(networkName: "Facebook", networkUrl: "http://www.facebook.com", socialNetworkHandle: "Devon Luongo")
        SocialNetwork sn_michael = new SocialNetwork(networkName: "Twitter", networkUrl: "http://www.twitter.com", socialNetworkHandle: "ProfessorKerry")
        SocialNetwork sn_haptic = new SocialNetwork(networkName: "LinkedIn", networkUrl: "http://www.linkedin.com", socialNetworkHandle: "Haptic Sales")

        WebSite web1 = new WebSite(webSiteName: "Google", webSiteType: "Company Site", webSiteUrl: "http://www.google.com")
        WebSite devon_github = new WebSite(webSiteName: "GitHub", webSiteType: "Company Site", webSiteUrl: "https://www.github.com/deluongo")
        WebSite haptic_github = new WebSite(webSiteName: "GitHub", webSiteType: "Company Site", webSiteUrl: "https://github.com/deluongo/haptic-ai/graphs/contributors?from=2017-04-16&to=2017-05-06&type=a")
        WebSite michael_github = new WebSite(webSiteName: "GitHub", webSiteType: "Company Site", webSiteUrl: "https://github.com/cscie56-2017/bookstore2017/tree/lecture4")

        ReviewSite review1 = new ReviewSite(reviewSiteName: "G2 Crowd", reviewSiteUrl: "http://www.g2crowd.com", reviewSiteHandle: "deluongo")

        Address address1 = new Address(locName: "Corporate Headquarters", locType: "Main Office", street: "999 Microsoft Dr.", city: "Wiscogi", state: "Washington", country: "United States", zip: "94999")
        Address address2 = new Address(locName: "Main Campus", locType: "Campus", street: "86 Brattle Street", city: "Cambridge", state: "Massachusetts", country: "United States", zip: "02138")
        Address address3 = new Address(locName: "Secret Offshore Base", locType: "Main Office", street: "Nowhere Dr.", city: "San Francisco", state: "California", country: "United States", zip: "94999")



        Employee devon = new Employee(salutation: "Dr.", firstName: "Devon", lastName: "Luongo", gender: "Trans", jobTitle: "Loving Husband",
                emailAddresses: [email_devon, email_admin], phoneNumbers: [phone_devon, phone_haptic, phone_admin], socialNetworks: [sn_michael, sn_haptic],
                webSites: [devon_github, haptic_github], reviewSites: [review1], addresses: [address1, address2, address3])
        Employee michael = new Employee(salutation: "Mr.", firstName: "Michael", lastName: "Kerry", gender: "Male", jobTitle: "Professor of Graduate Studies",
                emailAddresses: [email_mike, email_admin], phoneNumbers: [phone_admin, phone_haptic, phone_mike], socialNetworks: [sn_devon, sn_haptic],
                webSites: [michael_github, haptic_github], reviewSites: [review1], addresses: [address2, address3])
        Employee guest = new Employee(salutation: "Mrs.", firstName: "guest", lastName: "user", gender: "Unknown", jobTitle: "Secret",
                emailAddresses: [email_user], phoneNumbers: [phone_user, phone_haptic], socialNetworks: [sn_haptic], webSites: [web1, haptic_github],
                reviewSites: [review1], addresses: [address2, address3])



        User admin = new User(username: "admin", password: "supersecret",
                bio: 'Some Bio', birthDate: new Date(), height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg", employee: michael)

        saveObject(admin)

        User user = new User(username: "user", password: "cscie56",
                bio: 'Some Bio', birthDate: new Date(), height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg", employee: guest)
        saveObject(user)

        User devon_user = new User(username: "devon", password: "stephany",
                bio: 'Some Bio', birthDate: new Date(), height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg", employee: devon)
        saveObject(devon)

        Role adminRole = new Role(authority: Role.ROLE_ADMIN)
        saveObject(adminRole)
        Role userRole = new Role(authority: Role.ROLE_USER)
        saveObject(userRole)

        UserRole.create(admin, adminRole)
        UserRole.create(admin, userRole)
        UserRole.create(user, userRole)
        UserRole.create(devon_user, userRole)


        Team cscie56 = new Team(name:"cscie56", teamMembers: [devon, michael, guest])
        saveObject(cscie56)
    }

    /*  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *   ~~ !!! FUNCTION !!! ~~~  | ~~~~~~~~~~~~~ SAVE OBJECTS ~~~~~~~~~~~~~
     *  ========================= | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def saveObject(object) {
        if (!object.save(flush:true)) {
            object.errors.allErrors.each { println it }
        }
    }
}
