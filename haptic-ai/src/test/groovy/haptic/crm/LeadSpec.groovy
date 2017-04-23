package haptic.crm

import grails.test.mixin.TestFor
import haptic.connect.Communication
import haptic.eval.Action
import spock.lang.Specification
import spock.lang.Unroll
import grails.test.mixin.Mock


/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Lead)
@Mock([Action,Communication])
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
    }


    
}
