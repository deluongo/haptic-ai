package haptic.fields

import grails.test.mixin.TestFor
<<<<<<< HEAD
import haptic.connect.Call
=======
import haptic.connect.Communication
import haptic.connect.CommunicationSpec
>>>>>>> master
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(PhoneNumber)
class PhoneNumberSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test phoneNumber in proper format"() {
        when:"Phone number not in proper format"
            PhoneNumber testPhoneNumber = new PhoneNumber(  phoneNumber: '',
                                                            phoneType: 'Work',
                                                            primary: true,
                                                            dateCreated: new Date(),
<<<<<<< HEAD
                                                            lastCallAnswered: new Call(),
                                                            lastCallPlaced: new Call())
=======
                                                            lastCallAnswered: new Communication(),
                                                            lastCallPlaced: new Communication())
>>>>>>> master

        then:"Fail validation"
            !testPhoneNumber.validate()
    }
}
