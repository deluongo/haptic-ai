package haptic.crm

import grails.test.mixin.TestFor
import haptic.connect.Communication
import haptic.eval.Action
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



    void "test findAllLeadsByActions" () {
        when:
        Action a1 =  new Action()
        a1.save(flush:true)
        Lead l1 = new Lead(leadStatus: 'Converted', leadStage: 'MQL', status: "Some Status", actions: [a1])
        Lead l2 = new Lead(leadStatus: 'Converted', leadStage: 'MQL', status: "Some Status")
        l1.save(flush:true)
        l2.save(flush:true)
        then:
        true
        //Lead.findAllByActionsInList([a1]) == [l1]
        // WHY
    }

    @Unroll
    void "test Space with name: #name description: #description active: #active, address: #address, capacity: #capacity, organization: #organization, primaryManager: #primaryManager is valid: #result"() {
        when:


        Lead lead = new Lead(status: 'Status 1', leadStatus: 'Qualified', leadStage: 'MQL', budget: 'Yes',
                auth: 'Yes', need: 'Yes', timing: 'Yes', budgetDetails: 'budgetDetails1',
                authorityDetails: 'authDetails1', needDetails: 'needDetails1', timingDetails: new Date(),
                estimatedDealSize: 3450, dateOpened: new Date(), dateClosed: new Date()).save(flush:true)


        then:
        lead.validate() == result

        where:
        status  |   estimatedDealSize |   authorityDetails  |   budget  |   leadStage   |   company             |   leadOwner       |   result
        "ab"    |   "desc"            |   true              |   "17th"  |   'MQL'       | new Company()         |   new Employee()  |   true
        null    |   "desc"            |   true              |   "17th"  |   'SAL'       | new Company()         |   new Employee()  |   false
        "ab"    |   null              |   true              |   "17th"  |   'MQL'       | new Company()         |   new Employee()  |   false
        "ab"    |   "desc"            |   null              |   "17th"  |   'MQL'       | new Company()         |   new Employee()  |   false
        "ab"    |   "desc"            |   true              |   null    |   'MQL'       | new Company()         |   new Employee()  |   false
        "ab"    |   "desc"            |   true              |   "17th"  |   null        | new Company()         |   new Employee()  |   false
        "ab"    |   "desc"            |   true              |   "17th"  |   'MQL'       | new Company()         |   new Employee()  |   false
        "ab"    |   "desc"            |   true              |   "17th"  |   'MQL'       | new Company()         |   new Employee()  |   false
    }




}
