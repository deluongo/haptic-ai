package haptic.ai

import haptic.app.UserRole
import haptic.app.User
import haptic.app.Role
import haptic.crm.Company
import haptic.crm.Contact
import haptic.fields.EmailAddress
import haptic.crm.Lead

class BootStrap {

    def init = { servletContext ->
//        environments {
//            development {
//                //setupUsersAndRoles()
//            }
//            test {
//                //setupUsersAndRoles()
//            }
//            production {
//                // do nothing
//            }
//        }

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


        // People, Companies
        Company microsoft = new Company()
        microsoft.save(flush: true)
        Contact billGates = new Contact(salutation: 'Mr.', firstName: 'Bill', lastName: 'Gates', gender: 'M',
                                        jobRole: 'Management', jobTitle: 'CEO', roleDescription: 'Description', department: 'Dept.',
                                        company: microsoft, emailAddresses: billEmail)
        Contact billGates2 = new Contact(salutation: 'Mr.', firstName: 'Bill2', lastName: 'Gates', gender: 'M',
                                        jobRole: 'Management', jobTitle: 'CTO', roleDescription: 'Description', department: 'Dept.',
                                        company: microsoft, emailAddresses: bill2Email)
        billGates.save(flush: true)
        billGates2.save(flush: true)


        Company apple = new Company()
        apple.save(flush: true)
        Contact steveJobs = new Contact(salutation: 'Mr.', firstName: 'Steve', lastName: 'Jobs', gender: 'M',
                jobRole: 'Management', jobTitle: 'CEO', roleDescription: 'Description', department: 'Dept.',
                company: apple, emailAddresses: steveEmail)
        Contact steveJobs2 = new Contact(salutation: 'Mr.', firstName: 'Steve2', lastName: 'Jobs', gender: 'M',
                jobRole: 'Management', jobTitle: 'CTO', roleDescription: 'Description', department: 'Dept.',
                company: apple, emailAddresses: steve2Email)
        steveJobs.save(flush: true)
        steveJobs2.save(flush: true)


        // Contacts
        HashSet<Contact> lead1HashSet = new HashSet<Contact>()
        lead1HashSet.add(billGates)
        lead1HashSet.add(billGates2)

        HashSet<Contact> lead2HashSet = new HashSet<Contact>()
        lead2HashSet.add(steveJobs)
        lead2HashSet.add(steveJobs2)


        // Leads
        Lead lead1 = new Lead(status: '', leadStatus: 'Qualified', leadStage: 'MQL', budget: 'Yes',
                                auth: 'Yes', need: 'Yes', timing: 'Yes', budgetDetails: 'budgetDetails1',
                                authorityDetails: 'authDetails1', needDetails: 'needDetails1', timingDetails: new Date(),
                                estimatedDealSize: 3450.15, dateOpened: new Date(), dateClosed: new Date(), contacts: lead1HashSet)

        Lead lead2 = new Lead(status: '', leadStatus: 'Qualified', leadStage: 'MQL', budget: 'Yes',
                                auth: 'Yes', need: 'Yes', timing: 'Yes', budgetDetails: 'budgetDetails2',
                                authorityDetails: 'authDetails2', needDetails: 'needDetails2', timingDetails: new Date(),
                                estimatedDealSize: 5867.35, dateOpened: new Date(), dateClosed: new Date(), contacts: lead2HashSet)


        lead1.save(flush: true)
        lead2.save(flush: true)


    }
    def destroy = {
    }

    def setupUsersAndRoles() {
        User admin = new User(username: "admin", password: "supersecret",
                bio: 'Some Bio', birthDate: new Date(), birthPlace: "Home Town", height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg")

        saveObject(admin)
        User user = new User(username: "deluongo", password:"Stephany",
                bio: 'Some Bio', birthDate: new Date(), birthPlace: "Home Town", height: "6'2", weight: 160, universityAttended: "Some School", pictureURL: "https://pbs.twimg.com/media/Ce55dhKUYAAVEzF.jpg")
        saveObject(user)

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
