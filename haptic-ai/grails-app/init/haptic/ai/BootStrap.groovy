package haptic.ai

import haptic.app.UserRole
import haptic.app.User
import haptic.app.Role
import haptic.crm.Company
import haptic.crm.Contact
import haptic.crm.Lead
import haptic.fields.EmailAddress
import haptic.org.Employee

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
        HashSet<EmailAddress> billEmail = new HashSet<EmailAddress>()
        EmailAddress email1 = new EmailAddress(emailType: 'Primary', emailAddress: 'bill@microsoft.com', emailExtension: '@microsoft.com',
                emailStatus: 'Active', dateCreated: new Date())
        email1.save(flush: true)
        billEmail.add(email1)

        HashSet<EmailAddress> steveEmail = new HashSet<EmailAddress>()
        EmailAddress email2 = new EmailAddress(emailType: 'Primary', emailAddress: 'steve@apple.com', emailExtension: '@apple.com',
                emailStatus: 'Active', dateCreated: new Date())
        email2.save(flush: true)
        steveEmail.add(email2)

        HashSet<EmailAddress> bill2Email = new HashSet<EmailAddress>()
        EmailAddress email3 = new EmailAddress(emailType: 'Primary', emailAddress: 'bill2@microsoft.com', emailExtension: '@microsoft.com',
                emailStatus: 'Active', dateCreated: new Date())
        email3.save(flush: true)
        bill2Email.add(email3)

        HashSet<EmailAddress> steve2Email = new HashSet<EmailAddress>()
        EmailAddress email4 = new EmailAddress(emailType: 'Primary', emailAddress: 'steve2@apple.com', emailExtension: '@apple.com',
                emailStatus: 'Active', dateCreated: new Date())
        email4.save(flush: true)
        steve2Email.add(email4)


        //lead2.save(flush: true)

        //print(Lead.getAll())

        //contacts: lead1HashSet, company: microsoft
        //contacts: lead2HashSet, company: apple




        //Contacts
        def billGates = new Contact(salutation: 'Mr.', firstName: 'Bill', lastName: 'Gates', gender: 'Male',
                jobRole: 'Customer Support', jobTitle: 'CEO', roleDescription: 'Description', department: 'Support',
                emailAddresses: billEmail, neuralNetValue: "\$1,434")
        def billGates2 = new Contact(salutation: 'Mr.', firstName: 'Bill2', lastName: 'Gates', gender: 'Male',
                jobRole: 'Software Engineering', jobTitle: 'C-Level Executive', roleDescription: 'Description', department: 'Engineering',
                emailAddresses: bill2Email, neuralNetValue: "\$734")
        //billGates.save(flush: true)
        //billGates2.save(flush: true)



        def steveJobs = new Contact(salutation: 'Mr.', firstName: 'Steve', lastName: 'Jobs', gender: 'Male',
                jobRole: 'Account Management', jobTitle: 'CEO', roleDescription: 'Description', department: 'Sales',
                emailAddresses: steveEmail, neuralNetValue: "\$434")
        def steveJobs2 = new Contact(salutation: 'Mr.', firstName: 'Steve2', lastName: 'Jobs', gender: 'Male',
                jobRole: 'Product Marketing', jobTitle: 'CTO', roleDescription: 'Description', department: 'Marketing',
                emailAddresses: steve2Email, neuralNetValue: "\$234")
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



        User admin = new User(username: "admin", password: "supersecret",
                bio: 'Some Bio', birthDate: new Date(), birthPlace: "Home Town", height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg")

        saveObject(admin)
        User user = new User(username: "deluongo", password: "Stephany",
                bio: 'Some Bio', birthDate: new Date(), birthPlace: "Home Town", height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg")
        saveObject(user)

        Employee devon = new Employee(salutation: "Mr.", firstName: "Devon", lastName: "Luongo", gender: "male", jobTitle: "Founder & CEO", user: user)
        saveObject(devon)

        Role adminRole = new Role(authority: Role.ROLE_ADMIN)
        saveObject(adminRole)
        Role userRole = new Role(authority: Role.ROLE_USER)
        saveObject(userRole)

        UserRole.create(admin, adminRole)
        UserRole.create(admin, userRole)
        UserRole.create(user, userRole)
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
